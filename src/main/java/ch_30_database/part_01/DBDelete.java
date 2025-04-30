package ch_30_database.part_01;
import lombok.extern.log4j.Log4j2;
import java.sql.SQLException;
import java.util.Scanner;


@Log4j2
public class DBDelete extends DBSelect{

    public void  removeUser(){
        String user = inputUserId();
        if(deleteUser(user)){
            log.info("Data successfully deleted :)");
        } else {
            log.info("ERROR Data can't be deleted :(");
        }
    }

    private String inputUserId(){
        Scanner scanner = new Scanner(System.in);
        String userId, answer;
        boolean isFlag;

        do {
            System.out.println("수정할 회원의 아이디를 입력하세요: ");
            userId = scanner.nextLine();

            System.out.println("삭제할 회원의 아이디가 " + userId + "이 맞습니까? (y/n)");
            answer = scanner.nextLine();

            // 입력 값이 y가 아닌 경우 true, 같은 경우 false 반환
            isFlag = !answer.equals("y");
            if(!isFlag) {
                if(selectDuplicateId(userId)){
                    System.out.println("Continue....");
                }else{
                    isFlag = !isFlag;
                    System.out.println("UserID is not found :(");
                }
            }
        } while (isFlag);
        return userId;
    }

    public boolean deleteUser(String userId){
        int cnt = 0;
        String sql = "DELETE FROM tuser WHERE userId=?";
        try {
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, userId);
            cnt = prepareStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cnt==1;
    }
}
