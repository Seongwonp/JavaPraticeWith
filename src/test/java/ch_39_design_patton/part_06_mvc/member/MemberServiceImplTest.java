package ch_39_design_patton.part_06_mvc.member;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class MemberServiceImplTest {

    @Test
    void addMember() {
        MemberService memberService = new MemberServiceImpl();
        log.info(memberService.addMember(new MemberDTO("swp2002","11111","park")));
    }


    @Test
    public void addLoginHistoryTest(){
        MemberService memberService = new MemberServiceImpl();
        LoginHistoryDTO loginHistoryDTO = LoginHistoryDTO.builder().memberId("swp2002").success(true).build();
        log.info(memberService.insertHistoryMember(loginHistoryDTO));
    }
}