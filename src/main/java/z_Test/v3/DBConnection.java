package z_Test.v3;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DBConnection {
    //데이터베이스 연결 정보 저장 및 연결
    private static final String url = "jdbc:mariadb://localhost:3306/sample";
    private static final String user = "root";
    private static final String password = "4464";
    private static final String driver = "org.mariadb.jdbc.Driver";

    public static Connection getConnection(){
        try{
            //1. 드라이버 로딩
            Class.forName(driver); // org.mariadb.jdbc.Driver 클래스를 메모리에 로딩

            //2. 데이터베이스 연결
            //데이터베이스에 접속
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) { //드라이버 로딩 실패시
            e.printStackTrace();
            log.error("DB Loading Error :0");
        } catch (SQLException e) { //실패시
            e.printStackTrace();
            log.error("DB Connection Fail :( ");
        }
        return null;
    }



}
