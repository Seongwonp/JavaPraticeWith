package ch_30_database.part_01;

import lombok.extern.log4j.Log4j2;

/*
    JDBC Java DataBase Connectivity
    Java 프로그램에서 관계형 데이터베이스 RDBMS와 연동할 수 있도록 제공하는 표준 API.

    * JDBC를 이용하는 프로그램 작성 과정.
    1. 사용하고자 하는 RDBMS 에서 제공하는 JDBC 드라이버를 설치.
    2. JDBC 드라이버를 로딩.
    드라이버를 로딩할 떄에는 클래스의 동적 바인딩을 제공하는  Class 클래스의 static 메서드인 forName() 메서드를 사용.
    3. DBMS와 연결을 설정.
    java.sql 패키지가 제공하는 connection 객체를 사용.
    4. Select 구문을 실행할 때에는 Java.sql 패키지가 제공하는 Statement 객체와 ResultSet 객체를 사용.
    Statement 객체는 SQL 구문을 위한 것이고 Resultset 은 Select 구문을 실행한 결과를 다루기 위한 객체.


 */
@Log4j2
public class Test01_LoadDriver {
    //드라이버 클래스를 로드
    public static void main(String[] args) {
        loadDriver();
    }

    //2.JDBC 드라이버를 로딩.
    private static void loadDriver() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            log.info("Driver load successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("[Exception]: Driver not found:(");
        }
    }
}
