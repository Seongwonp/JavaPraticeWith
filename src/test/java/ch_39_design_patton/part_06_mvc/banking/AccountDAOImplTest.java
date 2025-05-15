package ch_39_design_patton.part_06_mvc.banking;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
class AccountDAOImplTest {

    AccountDAO accountDAO = new AccountDAOImpl();

    @Test
    void insertAccount() {
        AccountDTO accountDTO = AccountDTO.builder()
                .accountId("1111")
                .ownerName("sam")
                .build();

        log.info(accountDAO.insertAccount(accountDTO));

    }

    @Test
    void selectAccountBySearch() {
        log.info(accountDAO.selectAccountBySearch("accountId","1112"));
    }

    @Test
    void IsDuplicatedAccount() {
        log.info(accountDAO.IsDuplicatedAccount("1112"));
    }

    @Test
    void insertAccountHistory(){
        List<AccountDTO> accounts = accountDAO.selectAccountBySearch("accountId","1112");
        AccountDTO account = accounts.get(0);
        if(accountDAO.insertAccountHistory(account,1000,"입금")){
            log.info("Success");
        }
        else{
            log.info("Fail");
        }



    }



}
