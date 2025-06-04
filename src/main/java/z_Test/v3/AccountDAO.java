package z_Test.v3;


import java.util.*;
public interface AccountDAO {
    boolean addAccount(AccountDTO account);
    List<AccountDTO> listAccounts();
    List<AccountDTO> searchAccounts(String op, String value);
    boolean updateAccount(String accountId, int balance);
    boolean IsDuplicatedAccount(String accountId);// 중복검사
}
