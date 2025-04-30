package ch_30_database.part_01;
import lombok.extern.log4j.Log4j2;
import java.sql.SQLException;
import java.util.*;

/*
    1. 콘솔 처리하는 부분과 데이터베이스에 처리하는 부분을 메서드로 분리.
    2. 전체 회원 목록을 출력하는 메서드와 특정 회원을 검색하는 메서드로 나누어 구현.
 */
@Log4j2
public class DBSelect extends DBInsert {
    //전체 회원 출력
    public void printUsers(){
        List<UserDTO> users = selectUsers();
        if(!users.isEmpty()){
            System.out.println("All users found");
            for(UserDTO user : users){
                System.out.println("----------------");
                System.out.println("ID: " + user.getUserId());
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                System.out.println("Job: " + user.getJob());
            }
            System.out.println("=================");
        }
    }

    //검색할 아이디 입력받고 출력
    public void printSearchUser(){
        Scanner scanner = new Scanner(System.in);
        String userId, answer;

        boolean isFlag = true;
        do{
            System.out.print("Please enter a user ID: ");
            userId = scanner.nextLine();
            System.out.println(userId + " Is the following user ID? (y/n)");
            answer = scanner.nextLine();

            //answer가 y인경우 false 반환 -> 반복문 종료
            isFlag = !answer.equals("y");
        }while(isFlag);

        log.info(userId);

        // 2. 아이디로 검색
        UserDTO user = selectUser(userId);
        if(user != null){
            System.out.println("ID:" + user.getUserId());
            System.out.println("Name:" + user.getName());
            System.out.println("Age:" + user.getAge());
            System.out.println("Job:" + user.getJob());
        } else{
            System.out.println("User not found :(");
        }

    }

    public UserDTO selectUser(String userId){
        UserDTO user = null;
        String sql = "SELECT * FROM tuser WHERE userId = ?";
        try {
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, userId);
            resultSet = prepareStatement.executeQuery();
            if(resultSet.next()){
                user = new UserDTO();
                user.setUserId(resultSet.getString("userId"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setJob(resultSet.getString("job"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    private List<UserDTO> selectUsers() {
        String sql = "SELECT * FROM tuser";
        List<UserDTO> users = new ArrayList<>(); // 회원목록

        try {
            prepareStatement = connection.prepareStatement(sql);
            resultSet = prepareStatement.executeQuery();


            while (resultSet.next()) {
                UserDTO user = new UserDTO();
                user.setUserId(resultSet.getString("userId"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setJob(resultSet.getString("job"));
//                log.info(user);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }
}
