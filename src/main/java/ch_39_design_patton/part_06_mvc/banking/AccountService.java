package ch_39_design_patton.part_06_mvc.banking;

import java.util.*;

public interface AccountService {
    boolean addAccount(AccountDTO accountDTO);
    List<AccountDTO> selectAccountBySearch(int option, String keyword);
    List<AccountDTO> listAccount();
    boolean deposit(String accountId, int amount);
    boolean withdraw(String accountId, int amount);
    boolean addAccountHistory(AccountDTO accountDTO, int money, String part);
    List<AccountHistoryDTO> listHistory(String accountId);
}
