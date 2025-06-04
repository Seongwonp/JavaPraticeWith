package z_Test.v3;

import java.util.*;

public interface AccountService {
    boolean createAccount(AccountDTO account);
    List<AccountDTO> listAccount();
    List<AccountDTO> searchAccount(String search, String value);
    boolean deposit(String accountId, int amount);
    boolean withdraw(String accountId, int amount);
}
