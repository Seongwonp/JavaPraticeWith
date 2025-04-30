package ch_30_database.part_01;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.*;
/*
    회원 정보 수정
    1) 아이디를 입력받아서 검색을 하고, 아이디에 해당하는 데이터가 있으면 수정 화면이 나옴
    ->아이디에 해당하는 데이터가 없으면 "해당 아이디가 없습니다." 출력 후 아이디를 다시 입력받음.
    2) 나이와 직업을 수정할 수 있음
    3) 수정이 완료되면 수정된 회원 정보를 출력
 */
@Log4j2
public class DBUpdate extends DBSelect{

    public void modifyUser(){
        UserDTO user = inputUser();
        if(updateUser(user)){
            log.info("Data successfully updated :)");
        } else {
            log.info("ERROR Data not updated :(");
        }
    }
    private UserDTO inputUser() {
        Scanner scanner = new Scanner(System.in);
        UserDTO user = new UserDTO();
        String answer;
        boolean isFlag = true;

        do {
            System.out.println("수정할 회원의 아이디를 입력하세요: ");
            user.setUserId(scanner.nextLine());

            System.out.println("수정할 회원의 아이디가 " + user.getUserId() + "이 맞습니까? (y/n)");
            answer = scanner.nextLine();

            // 입력 값이 y가 아닌 경우 true, 같은 경우 false 반환
            isFlag = !answer.equals("y");
            if(!isFlag) {
                if(selectDuplicateId(user.getUserId())){
                    System.out.println("Continue to Update");
                }else{
                    System.out.println("UserID is not found :(");
                }
            }
        } while (isFlag);

        //수정할 정보 입력
        System.out.print("수정할 회원의 나이를 입력하세요(숫자만): ");
        user.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("수정할 회원의 직업을 입력하세요: ");
        user.setJob(scanner.nextLine());

        return user;

    }

    public boolean updateUser(UserDTO user){
        String sql = "UPDATE tuser SET age = ? , job = ? WHERE userId = ?";

        try {
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, user.getAge());
            prepareStatement.setString(2, user.getJob());
            prepareStatement.setString(3, user.getUserId());
            return prepareStatement.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }
}
