package ch_39_design_patton.part_06_mvc.banking;

import lombok.extern.log4j.Log4j2;
import java.sql.*;

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
            Connection connection = java.sql.DriverManager.getConnection(url, user, password);//데이터베이스에 접속
            log.info("DB Connection Success :) ");
            return connection;
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
