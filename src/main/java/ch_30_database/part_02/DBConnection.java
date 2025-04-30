package ch_30_database.part_02;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DBConnection {
    private static final String driver = "org.mariadb.jdbc.Driver";
    private static final String host = "127.0.0.1";
    private static final String port = "3306";
    private static final String name = "sample";
    private static final String url = "jdbc:mariadb://" + host + ":" + port + "/" + name;
    private static final String user = "root";
    private static final String password = "4464";

    public static Connection getConnection(){
        //디비 접속
        try {
            Class.forName(driver); //JDBC 드라이버 등록.
            Connection connection = DriverManager.getConnection(url, user, password);
            if(connection != null) {
                log.info("Connected to database!!");
                log.info("Hello!! Welcome to MariaDB " + user + " :)");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            log.info("Could not load JDBC driver!!!!");
            e.printStackTrace();
        } catch (
                SQLException e) {
            log.info("Could not connect to database :(");
            e.printStackTrace();
        }
        return null;
    }

}
