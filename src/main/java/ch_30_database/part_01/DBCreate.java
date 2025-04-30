package ch_30_database.part_01;

import lombok.extern.log4j.Log4j2;
import java.sql.SQLException;
@Log4j2
//jdbc -> Mybatis -> JPA
public class DBCreate extends DB {

    /* 매개변수로 받은 이름의 테이블이 존재하는지 확인
        ->같은 이름의 테이블이 있는데 같은 이름의 테이블을 생성하면 에러발생. */
    private boolean isTableExists(String tableName) {
        String sql = "show tables"; // 생성된 테이블 목록을 가져오는 SQL문
        boolean isFlag = false; // 테이블이 존재하는지 확인하는 변수

        try {
            prepareStatement = connection.prepareStatement(sql); //쿼리 실행 준비
            resultSet = prepareStatement.executeQuery(); //쿼리 실행 후 결과를 받음
            while (resultSet.next()) { // resultSet.next() 가 실행되면 한칸씩 내려가면서 데이터 존재 유무를 true/false 반환
                if(tableName.equals(resultSet.getString(1))) {
                    isFlag = true;
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isFlag;
    }

    /*
       *테이블을 생성하는 메서드
        생성할 테이블 이름과 생성하는 sql문 을 매개변수로 받음
        1) 테이블이 존재하는지 확인후
        2) 없으면 생성
     */
    public void createTable(String tableName, String sql){
        if(isTableExists(tableName)){
            log.info("Table: " + tableName + " already exists!!");
            return;
        }

        //같은 이름의 테이블이 없는 경우 생성
        try {
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.execute(); // 쿼리 실행
            if(isTableExists(tableName)){
                log.info("Table: " + tableName + " created! :)");
            } else {
                log.info("Table: " + tableName + " failed to create :(");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
