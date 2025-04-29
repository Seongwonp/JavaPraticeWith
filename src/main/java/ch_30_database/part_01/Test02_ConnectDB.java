package ch_30_database.part_01;



/*
  3. DBMS와 연결을 설정.
    java.sql 패키지가 제공하는 Connection 객체를 사용.
    Connection 객체는 역시 java.sql패키지에 포함되어 있는 DriverManager 클래스의 getConnection() 메서드를 이용.
    getConnection(String url, String user, String password) 메서드는 static 메서드로서
    url은 서버와 데이터베이스 위치를 나타내고, user은 사용자 접속 아이디, password는 접속 비밀번호를 지정.

 */

public class Test02_ConnectDB {
    public static void main(String[] args) {
        DB db = new DB();
        db.connectDB();
        db.closeDB();
    }
}
