package ch_39_design_patton.part_06_mvc.banking;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
class AccountServiceImplTest {
    AccountDAO accountDAO = new AccountDAOImpl();
    AccountService accountService = new AccountServiceImpl();
    @Test
    void addAccount() {
        AccountDTO accountDTO = AccountDTO.builder()
                .accountId("1112")
                .ownerName("Park")
                .build();
        if(accountDAO.insertAccount(accountDTO)){
            log.info("Success");
        }else{
            log.info("Fail");
        }
    }

    @Test
    void selectAccount() {
        List<AccountDTO> accounts = accountDAO.listAccount();
//        for(AccountDTO account : accounts){
//            log.info(account);
//        }
        accounts.forEach(it->log.info(it));
    }


    @Test
    void selectAccountBySearch() {
        List<AccountDTO> accounts = accountService.selectAccountBySearch(1,"1112");
        accounts.forEach(it->log.info(it));
    }

    @Test
    void deposit(){
        if(accountService.deposit("1112",1000)){
            log.info("Success");
        }
        else{
            log.info("Fail");
        }

    }

}