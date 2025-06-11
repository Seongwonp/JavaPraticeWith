package ch_39_design_patton.part_06_mvc.member;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class MemberDAOImpl implements MemberDAO {

    @Override
    public boolean insertMember(MemberDTO memberDTO) {
        String SQL = "INSERT INTO member(memberId, passwd, name) VALUES (?, password(?), ?)";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setString(1, memberDTO.getMemberId());
            preparedStatement.setString(2, memberDTO.getPasswd());
            preparedStatement.setString(3, memberDTO.getName());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean selectMember(String memberId, String passwd) {
        String SQL = "SELECT * FROM member WHERE memberId = ? AND passwd = password(?)";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
            preparedStatement.setString(1, memberId);
            preparedStatement.setString(2, passwd);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                resultSet.close();
                return true;
            }
        }catch(SQLException e) {
            log.error(e.getMessage());
        }
        return false;
    }


    @Override
    public boolean findMember(String memberId) {
        String SQL = "SELECT COUNT(*) FROM member WHERE memberId = ?";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
            preparedStatement.setString(1, memberId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt(1) > 0;
        }catch(SQLException e) {
            log.error(e.getMessage());
        }
        return false;
    }


    @Override
    public List<MemberDTO> selectAllMembers() {
        String SQL = "SELECT * FROM member";
        List<MemberDTO> members = new ArrayList<>();
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setMemberId(resultSet.getString("memberId"));
                memberDTO.setName(resultSet.getString("name"));
                members.add(memberDTO);
            }
            resultSet.close();
        }catch(SQLException e) {
            log.error(e.getMessage());
        }
        return members;
    }

    @Override
    public MemberDTO selectSearchMember(String memberId) {
        String SQL = "SELECT * FROM member WHERE memberId = ?";
        MemberDTO memberDTO = new MemberDTO();
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
            preparedStatement.setString(1, memberId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                memberDTO.setMemberId(resultSet.getString("memberId"));
                memberDTO.setName(resultSet.getString("name"));
            }
            resultSet.close();
        }catch(SQLException e) {
            log.error(e.getMessage());
        }

        return memberDTO;
    }


    @Override
    public boolean insertHistoryMember(LoginHistoryDTO loginHistoryDTO) {
        String SQL = "INSERT INTO login_history(memberId, success) VALUES (?, ?)";
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
            preparedStatement.setString(1, loginHistoryDTO.getMemberId());
            preparedStatement.setBoolean(2, loginHistoryDTO.isSuccess());
            return preparedStatement.executeUpdate() > 0;
        }catch(SQLException e){
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public List<LoginHistoryDTO> selectHistoryList() {
        String SQL = "SELECT * FROM login_history";
        List<LoginHistoryDTO> historys = new ArrayList<>();
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                LoginHistoryDTO loginHistoryDTO = LoginHistoryDTO.builder()
                        .no(resultSet.getInt("no"))
                        .memberId(resultSet.getString("memberId"))
                        .success(resultSet.getBoolean("success"))
                        .createdAt(resultSet.getTimestamp("createdAt").toLocalDateTime())
                        .build();
                historys.add(loginHistoryDTO);
            }
            resultSet.close();
        }catch(SQLException e){
            log.error(e.getMessage());
        }
        return historys;
    }

    @Override
    public List<LoginHistoryDTO> selectSearchHistory(String memberId) {
        String SQL = "SELECT * FROM login_history WHERE memberId = ?";
        List<LoginHistoryDTO> historys = new ArrayList<>();
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                LoginHistoryDTO loginHistoryDTO = LoginHistoryDTO.builder()
                        .no(resultSet.getInt("no"))
                        .memberId(resultSet.getString("memberId"))
                        .success(resultSet.getBoolean("success"))
                        .createdAt(resultSet.getTimestamp("createdAt").toLocalDateTime())
                        .build();
                historys.add(loginHistoryDTO);
            }
            resultSet.close();
        }catch(SQLException e){
            log.error(e.getMessage());
        }

        return historys;
    }
}
