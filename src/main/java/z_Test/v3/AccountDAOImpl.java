package z_Test.v3;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Log4j2
public class AccountDAOImpl implements AccountDAO {
    // 계좌 정보를 데이터베이스에 추가하는 메서드
    @Override
    public boolean addAccount(AccountDTO account) {
        String SQL = "INSERT INTO bank_account(accountId,ownerName) Value (?,?)";
        // try-with-resources를 사용하여 DB 연결과 PreparedStatement를 자동으로 닫음
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL)){
            preparedStatement.setString(1, account.getAccountId());
            preparedStatement.setString(2, account.getOwnerName());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            // 예외 발생 시 로그에 에러 기록
            log.error(e);
        }
        return false;
    }

    // 모든 계좌 정보를 리스트로 조회하는 메서드
    @Override
    public List<AccountDTO> listAccounts() {
        String SQL = "SELECT * FROM bank_account ORDER BY createdAt DESC ";
        List<AccountDTO> accounts = new ArrayList<>();
        // try-with-resources로 DB 연결과 PreparedStatement 자동 닫기
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            // 결과셋을 순회하며 계좌 정보를 리스트에 담는다
            while(resultSet.next()){
               AccountDTO accountDTO = new AccountDTO();
                accountDTO.setAccountId(resultSet.getString("accountId"));
                accountDTO.setOwnerName(resultSet.getString("ownerName"));
                accountDTO.setBalance(resultSet.getInt("balance"));
                accountDTO.setCreatedAt(resultSet.getTimestamp("createdAt").toLocalDateTime());
                accounts.add(accountDTO);
            }
        }catch(Exception e){
            // 예외 발생 시 로그에 에러 기록
            log.error(e);
        }
        return accounts;
    }

    // 계좌의 잔액 정보를 수정하는 메서드
    @Override
    public boolean updateAccount(String accountId, int balance) {
        String SQL = "UPDATE bank_account SET balance = ? WHERE accountId = ?";
        // try-with-resources로 PreparedStatement와 DB 연결 자동 닫기
        try(
                PreparedStatement preparedStatement = Objects.requireNonNull(DBConnection.getConnection()).prepareStatement(SQL);
                Connection connection = DBConnection.getConnection();
                ){
            preparedStatement.setInt(1, balance);
            preparedStatement.setString(2, accountId);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            // 예외 발생 시 로그에 에러 기록
            log.error(e);
        }
        return false;
    }

    // 조건에 맞는 계좌 목록을 검색하는 메서드
    @Override
    public List<AccountDTO> searchAccounts(String op, String value) {
        List<AccountDTO> accounts = new ArrayList<>();
        String SQL = "SELECT * FROM bank_account WHERE " + op + "= ? ORDER BY createdAt DESC";
        // try-with-resources로 PreparedStatement와 DB 연결 자동 닫기
        try(
                PreparedStatement preparedStatement = Objects.requireNonNull(DBConnection.getConnection()).prepareStatement(SQL);
                Connection connection = DBConnection.getConnection();
                ){
            preparedStatement.setString(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            // 검색 결과를 리스트에 담는다
            while(resultSet.next()){
                AccountDTO accountDTO = new AccountDTO();
                accountDTO.setAccountId(resultSet.getString("accountId"));
                accountDTO.setOwnerName(resultSet.getString("ownerName"));
                accountDTO.setBalance(resultSet.getInt("balance"));
                accountDTO.setCreatedAt(resultSet.getTimestamp("createdAt").toLocalDateTime());
                accounts.add(accountDTO);
            }
        } catch (SQLException e) {
            // 예외 발생 시 로그에 에러 기록
            log.error(e);
        }
        return accounts;
    }

    // 중복된 계좌 ID가 있는지 확인하는 메서드
    @Override
    public boolean IsDuplicatedAccount(String accountId) {
        String SQL = "SELECT COUNT(*) FROM bank_account WHERE accountId = ?";
        // try-with-resources로 PreparedStatement와 DB 연결 자동 닫기
        try(
                PreparedStatement preparedStatement = Objects.requireNonNull(DBConnection.getConnection()).prepareStatement(SQL);
                Connection connection = DBConnection.getConnection();
                ){
            preparedStatement.setString(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt(1) > 0;
        }catch(Exception e){
            // 예외 발생 시 로그에 에러 기록
            log.error(e);
        }
        return false;
    }
}
