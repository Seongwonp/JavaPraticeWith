package ch_39_design_patton.part_06_mvc.member;

import java.util.*;

public interface MemberDAO {
    boolean insertMember(MemberDTO memberDTO);
    boolean selectMember(String memberId, String password);
    boolean findMember(String memberId);
    List<MemberDTO> selectAllMembers();
    MemberDTO selectSearchMember(String memberId);


    //Login History
    boolean insertHistoryMember(LoginHistoryDTO loginHistoryDTO);
    List<LoginHistoryDTO> selectHistoryList();
    List<LoginHistoryDTO> selectSearchHistory(String memberId);

}
