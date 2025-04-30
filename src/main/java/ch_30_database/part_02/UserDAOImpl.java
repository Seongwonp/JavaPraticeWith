package ch_30_database.part_02;

import java.sql.*;
import java.util.*;

public class UserDAOImpl implements UserDAO {

    @Override
    public List<UserDTO> selectUsers() {
         String sql = "SELECT * FROM tuser";
        List<UserDTO> users = new ArrayList<>(); // 회원목록

        try (   Connection connection = DBConnection.getConnection();
                PreparedStatement  prepareStatement = connection.prepareStatement(sql);){
            ResultSet resultSet = prepareStatement.executeQuery();
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

    @Override
    public UserDTO selectUser(String userId) {
        UserDTO user = null;
        String sql = "SELECT * FROM tuser WHERE userId = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement prepareStatement = connection.prepareStatement(sql);
                ){
            prepareStatement.setString(1, userId);
            ResultSet resultSet = prepareStatement.executeQuery();
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


    @Override
    public boolean insertUser(UserDTO user) {

        //매개변수화된 SQL문 작성
        String sql = "INSERT INTO tUser (userId, name, age, job) VALUES (?, ?, ?, ?)";

        int row=0;
        try (
                Connection connection = DBConnection.getConnection(); //쿼리 실행 준비
                PreparedStatement prepareStatement = connection.prepareStatement(sql);
                ){
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

    @Override
    public boolean selectDuplicateId(String userId) {
        String sql = "SELECT COUNT(*) AS result FROM tUser WHERE userId = ?";
        boolean flag = false;
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement prepareStatement = connection.prepareStatement(sql);
                ){
            prepareStatement.setString(1, userId);
            ResultSet resultSet = prepareStatement.executeQuery();
            resultSet.next();
            flag = resultSet.getInt("result") != 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean updateUser(UserDTO user) {
        String sql = "UPDATE tuser SET age = ? , job = ? WHERE userId = ?";

        try(Connection connection = DBConnection.getConnection();
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
                ) {
            prepareStatement.setInt(1, user.getAge());
            prepareStatement.setString(2, user.getJob());
            prepareStatement.setString(3, user.getUserId());
            return prepareStatement.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteUser(String userId) {
        return false;
    }
}
