package ch_30_database.part_01;

import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.Scanner;
@Log4j2
public class DBInsert extends DB {
    /*
        1. 콘솔로 입력하는 부분과 데이터베이스에 저장하는 부분을 메서드로 분리.

     */

    public void addUser(){
        inputUser();
    }

    //콘솔로 회원 정보를 받음
    private void inputUser(){

        Scanner scanner = new Scanner(System.in);
        String userId, name, job;
        int age;
        boolean isFlag = false;

        do{
            System.out.print("신규 회원의 아이디를 입력하세요(영어나 숫자, 이전 데이터에서 사용한 값은 안됨): ");
            userId = scanner.nextLine();
            System.out.print("신규 회원의 이름을 입력하세요: ");
            name = scanner.nextLine();
            System.out.print("신규 회원의 나이를 입력하세요(숫자만): ");
            age = Integer.parseInt(scanner.nextLine());
            System.out.print("신규 회원의 직업을 입력하세요: ");
            job = scanner.nextLine();

            System.out.println("신규 회원: [ " + userId + " | " + name + " | " + age + " | " + job + " ] 이 맞습니까? (y/n)");
            String answer = scanner.nextLine();


            isFlag = !answer.equals("y");
        }while(isFlag);

        if(insertUser(userId, name, age, job)) {
            log.info("Data successfully added :)");
        } else {
            log.info("Data not added :(");
        }

    }

    //정보를 받아서 디비에 입력
    private boolean insertUser(String userId, String name, int age, String job){

        //매개변수화된 SQL문 작성
        String sql = "INSERT INTO tUser (userId, name, age, job) VALUES (?, ?, ?, ?)";

        int row=0;
        try {
            prepareStatement = connection.prepareStatement(sql); //쿼리 실행 준비

            //?에 들어갈 값을 지정해주는데, ?는 순서에 따라 1번부터 번호 부여
            prepareStatement.setString(1, userId);
            prepareStatement.setString(2, name);
            prepareStatement.setInt(3, age);
            prepareStatement.setString(4, job);

            //SQL문 실행
            //prepareStatement.executeQuery(): select
            //prepareStatement.executeUpdate(): insert,update, delete ...

            //sql문 실행, 영향받은 데이터 갯수(정수) 반환.
            row = prepareStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row == 1;
    }
}
