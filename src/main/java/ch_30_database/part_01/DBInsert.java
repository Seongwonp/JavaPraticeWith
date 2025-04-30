package ch_30_database.part_01;

import lombok.extern.log4j.Log4j2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
@Log4j2
public class DBInsert extends DB {
    /*
        1. 콘솔로 입력하는 부분과 데이터베이스에 저장하는 부분을 메서드로 분리.
        2. 입력하는 데이터는 테이블과 유사한 UserDTO에 넣어서, 데이터베이스에 저장하는 메서드로 전달.
        DTO: data Transfer Object. 데이터 운반하는 역할을 하는 객체.
     */

    public void addUser(){
        UserDTO user = inputUser();
        if(insertUser(user)){
            log.info("Data successfully added :)");
        } else {
            log.info("Data not added :(");
        }
    }

    //콘솔로 회원 정보를 받음
    private UserDTO inputUser(){

        Scanner scanner = new Scanner(System.in);
        UserDTO user = new UserDTO();
        boolean isFlag = false;

        do{
            System.out.print("신규 회원의 아이디를 입력하세요(영어나 숫자, 이전 데이터에서 사용한 값은 안됨): ");
            user.setUserId(scanner.nextLine());

            //아이디 중복 확인
            if(selectDuplicateId(user.getUserId())){
                isFlag = true;
                log.info("UserId already exists:( Please try another ID!!");
                continue;
            }

            System.out.print("신규 회원의 이름을 입력하세요: ");
            user.setName(scanner.nextLine());
            System.out.print("신규 회원의 나이를 입력하세요(숫자만): ");
            user.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.print("신규 회원의 직업을 입력하세요: ");
            user.setJob(scanner.nextLine());

            System.out.println("신규 회원: [ " + user.getUserId() + " | " + user.getName() + " | " + user.getAge() + " | " + user.getJob() + " ] 이 맞습니까? (y/n)");
            String answer = scanner.nextLine();
            isFlag = !answer.equals("y");
        }while(isFlag);

        log.info(user.toString());
        return user;
    }

    //정보를 받아서 디비에 입력
    private boolean insertUser(UserDTO user){

        //매개변수화된 SQL문 작성
        String sql = "INSERT INTO tUser (userId, name, age, job) VALUES (?, ?, ?, ?)";

        int row=0;
        try {
            prepareStatement = connection.prepareStatement(sql); //쿼리 실행 준비

            //?에 들어갈 값을 지정해주는데, ?는 순서에 따라 1번부터 번호 부여
            prepareStatement.setString(1, user.getUserId());
            prepareStatement.setString(2, user.getName());
            prepareStatement.setInt(3, user.getAge());
            prepareStatement.setString(4, user.getJob());

            //SQL문 실행
            //prepareStatement.executeQuery(): select
            //prepareStatement.executeUpdate(): insert,update, delete ...

            //sql문 실행, 영향 받은 행(정수) 반환.
            row = prepareStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return row == 1;
    }

    //아이디 중복 확인
    protected boolean selectDuplicateId(String userId){
        String sql = "SELECT COUNT(*) AS result FROM tUser WHERE userId = ?";
        boolean flag = false;
        try{
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, userId);

            resultSet = prepareStatement.executeQuery();
            resultSet.next();
            flag = resultSet.getInt("result") != 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

}
