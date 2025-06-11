package ch_39_design_patton.part_06_mvc.member;

import java.util.List;

public interface MemberService {
    boolean addMember(MemberDTO memberDTO);
    boolean selectMember(String memberId, String password);
    boolean isDuplicateMember(String memberId);
    List<MemberDTO> selectAllMembers();
    MemberDTO selectSearchMember(String memberId);

    boolean insertHistoryMember(LoginHistoryDTO loginHistoryDTO);
    List<LoginHistoryDTO> selectHistoryList();
    List<LoginHistoryDTO> selectSearchHistory(String memberId);
}
