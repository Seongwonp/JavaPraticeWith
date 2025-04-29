package ch_30_database.part_01;

import lombok.extern.log4j.Log4j2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DB {
    // 사용할 객체를 위한 참조변수 선언. 클래스 내의 여러 메서드에서 사용해야 되서 인스턴스 변수로 선언.
    protected Connection connection = null;

    public void connectDB() {
        final String driver = "org.mariadb.jdbc.Driver";
        final String host = "127.0.0.1";
        final String port = "3306";
        final String name = "sample";
        final String url = "jdbc:mariadb://" + host + ":" + port + "/" + name;
        final String user = "root";
        final String password = "4464";
        //디비 접속
        try {
            Class.forName(driver); //JDBC 드라이버 등록.
            connection = DriverManager.getConnection(url,user,password);
            if(connection != null) {
                log.info("Connected to database!!");
                log.info("Hello!! Welcome to MariaDB " + user + " :)");
            }
        } catch (ClassNotFoundException e) {
            log.info("Could not load JDBC driver!!!!");
            e.printStackTrace();
        } catch (SQLException e) {
            log.info("Could not connect to database :(");
            e.printStackTrace();
        }
    }

    public void closeDB(){
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
                log.info("DB connection closed...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
