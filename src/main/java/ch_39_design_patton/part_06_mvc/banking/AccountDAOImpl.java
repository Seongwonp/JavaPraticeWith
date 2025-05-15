package ch_39_design_patton.part_06_mvc.banking;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Log4j2
public class AccountDAOImpl implements AccountDAO {
    /*
        DAO : Data Access Object
        데이터베이스 처리를 하는 클래스.
        논리적인 처리(중복 확인 등)는 하지말고,  데이터를 전달 받아서 쿼리를 실행하고 결과 값을 반환하는 역할만 함.
        이렇게 작업을 하면 1) 공동작업시 업무 분담에 유리. 같은 논리적인 처리를 컨트롤러와 DAO 에서 중복할 수 있는 가능성을 제거.
        2) 유지 보수가 유리. 쿼리 관련 수정이나 오류일 경우 DAO 부터 확인하면 됨.
     */

    // 데이터베이스에 새로운 계좌 정보를 삽입하는 메서드
    @Override
    public boolean insertAccount(AccountDTO account) {
        String SQL = "INSERT INTO account (accountId, ownerName) VALUES (?,?)";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL); //Null이 아닌경우 sql문 실행
        ) {
            preparedStatement.setString(1, account.getAccountId());
            preparedStatement.setString(2, account.getOwnerName());
            return preparedStatement.executeUpdate() == 1; //insert의 경우 정상적으로 실행이 되었으면 1이 리턴
        } catch (SQLException e) {
            log.error("DB Error : {}", e.getMessage());
        }
        return false;
    }

    // 지정된 컬럼과 키워드를 사용해 데이터베이스에서 계좌 정보를 검색하는 메서드
    @Override
    public List<AccountDTO> selectAccountBySearch(String column, String keyword) {
        String SQL = "SELECT * FROM account WHERE " + column + " = ? ORDER BY createdAt DESC";

        List<AccountDTO> accounts = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
        ) {
            preparedStatement.setString(1, keyword);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                AccountDTO accountDTO = AccountDTO.builder()
                        .accountId(resultSet.getString("accountId"))
                        .ownerName(resultSet.getString("ownerName"))
                        .balance(resultSet.getInt("balance"))
                        .createdAt(resultSet.getTimestamp("createdAt").toLocalDateTime())
                        .build();
                accounts.add(accountDTO);
            }

        } catch (SQLException e) {
            log.error("ID Not Found :(");
        }
        return accounts;
    }


    // 특정 계좌의 잔액을 데이터베이스에서 업데이트하는 메서드
    @Override
    public boolean updateBalance(String accountId, int amount) {
        String SQL = "UPDATE account SET balance = ? WHERE accountId = ?";
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
        ){
            preparedStatement.setInt(1, amount);
            preparedStatement.setString(2, accountId);
            return preparedStatement.executeUpdate() == 1;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    // 데이터베이스에 저장된 모든 계좌 정보를 조회하는 메서드
    @Override
    public List<AccountDTO> listAccount() {
        String SQL = "SELECT * FROM account ORDER BY createdAt DESC";
        List<AccountDTO> users = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                AccountDTO accountDTO = new AccountDTO();
                accountDTO.setAccountId(resultSet.getString("accountId"));
                accountDTO.setOwnerName(resultSet.getString("ownerName"));
                accountDTO.setBalance(resultSet.getInt("balance"));
                accountDTO.setCreatedAt(resultSet.getTimestamp("createdAt").toLocalDateTime());
                users.add(accountDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public boolean insertAccountHistory(AccountDTO accountDTO, int money, String part) {
        String SQL = "INSERT INTO accounthistory (accountId, part, money, balance) VALUES (?,?,?,?)";
        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
                ){
            preparedStatement.setString(1, accountDTO.getAccountId());
            preparedStatement.setString(2, part);
            preparedStatement.setInt(3, money);
            preparedStatement.setInt(4, accountDTO.getBalance());
            return preparedStatement.executeUpdate() == 1; //insert의 경우 정상적으로 실행이 되었으면 1이 리턴
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public List<AccountHistoryDTO> listHistory(String accountId) {
        String SQL = "SELECT * FROM accounthistory WHERE accountId = ? ORDER BY no DESC";
        List<AccountHistoryDTO> accounts = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
        ) {
            preparedStatement.setString(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                AccountHistoryDTO account = AccountHistoryDTO.builder()
                        .accountId(resultSet.getString("accountId"))
                        .part(resultSet.getString("part"))
                        .money(resultSet.getInt("money"))
                        .balance(resultSet.getInt("balance"))
                        .creatAt(resultSet.getTimestamp("creatAt").toLocalDateTime())
                        .build();
                accounts.add(account);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return accounts;
    }

    // 데이터베이스에서 계좌 ID의 중복 여부를 검사하는 메서드
    @Override
    public boolean IsDuplicatedAccount(String accountId) {
        String SQL = "SELECT COUNT(*) AS result FROM account WHERE accountId = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SQL);
        ) {
            preparedStatement.setString(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("result") != 0; // 중복일 경우 true 반환
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }




}
