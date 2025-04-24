package ch_10_interface_ex.ex_01;

public class Test {
    /*
        DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData, MySqlData 클래스가 있습니다.
        메인 클래스를 보고 출력 결과가 다음과 같을 때 인터페이스와 클래스를 만들어서 완성하세요.
    */
    public static void dbWork(DataAccessObject dao) {
        dao.insert();
        dao.select();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new OracleData());
        //        Oracle DB에 삽입
        //        Oracle DB에서 검색
        //        Oracle DB를 수정
        //        Oracle DB에서 삭제
        System.out.println();
        dbWork(new MySqlData());
        //        MySql DB에 삽입
        //        MySql DB에서 검색
        //        MySql DB를 수정
        //        MySql DB에서 삭제
    }
}
