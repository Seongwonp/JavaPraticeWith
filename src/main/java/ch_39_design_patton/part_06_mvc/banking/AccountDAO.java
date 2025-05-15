package ch_39_design_patton.part_06_mvc.banking;
import java.util.*;
public interface AccountDAO {
    boolean insertAccount(AccountDTO account);
    List<AccountDTO> selectAccountBySearch(String colum, String keyword);
    boolean updateBalance(String accountId, int amount);
    List<AccountDTO> listAccount();
    boolean insertAccountHistory(AccountDTO accountDTO, int money, String part);
    List<AccountHistoryDTO> listHistory(String accountId);
    boolean IsDuplicatedAccount(String accountId);// 중복검사
}
