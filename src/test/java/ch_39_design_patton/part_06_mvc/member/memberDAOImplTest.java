package ch_39_design_patton.part_06_mvc.member;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@Log4j2
class memberDAOImplTest {
    MemberDAO memberDAO = new MemberDAOImpl();

    @Test
    void insertMember() {
        memberDAO.insertMember(new MemberDTO("asd112234","1234","홍길동"));
    }

    @Test
    void selectMember() {
        log.info(memberDAO.selectMember("asd112234","1234"));
    }

    @Test
    void findMember() {
        log.info(memberDAO.findMember("asd1122"));
    }



    @Test
    void insertHistory(){
        LocalDateTime now = LocalDateTime.now();

    }
}