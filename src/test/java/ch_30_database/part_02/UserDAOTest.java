package ch_30_database.part_02;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import java.util.*;

@Log4j2
class UserDAOTest {
    UserDAO userDAO = new UserDAOImpl();
    @Test
    void selectUsers() {
        List<UserDTO> userDTOList =  userDAO.selectUsers();
        log.info(userDTOList);
    }

    @Test
    void selectUser() {
        UserDTO user = userDAO.selectUser("111");
        log.info(user);
    }

    @Test
    void insertUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("1112");
        userDTO.setName("tom");
        userDTO.setAge(10);
        userDTO.setJob("dev");
        userDAO.insertUser(userDTO);
    }

    @Test
    void selectDuplicateId() {
        boolean result1 = userDAO.selectDuplicateId("111"); //존재
        boolean result2 = userDAO.selectDuplicateId("1234"); //존재X
        if(result1){
            log.info("중복");
        }else {
            log.info("중복X");
        }
        if(result2){
            log.info("중복");
        }else {
            log.info("중복X");
        }

    }

    @Test
    void updateUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("test12");
        userDTO.setName("test11");
        userDTO.setAge(33);
        userDTO.setJob("repairman");
        boolean isUpdate = userDAO.updateUser(userDTO);
        if(isUpdate){
            log.info("Complicated Update Age & Job ");
        } else{
            log.info("ERROR Not Complicated Update Age & Job ");
        }
    }

    @Test
    void deleteUser() {
    }
}