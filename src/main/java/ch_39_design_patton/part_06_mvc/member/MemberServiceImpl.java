package ch_39_design_patton.part_06_mvc.member;


import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Log4j2
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO = new MemberDAOImpl();

    @Override
    public boolean addMember(MemberDTO memberDTO) {
        return memberDAO.insertMember(memberDTO);
    }

    @Override
    public MemberDTO selectSearchMember(String memberId) {
        return memberDAO.selectSearchMember(memberId);
    }

    @Override
    public List<MemberDTO> selectAllMembers() {
        return memberDAO.selectAllMembers();
    }

    @Override
    public boolean selectMember(String memberId, String password) {
        return memberDAO.selectMember(memberId, password);
    }

    @Override
    public boolean isDuplicateMember(String memberId) {
        return memberDAO.findMember(memberId);
    }

    @Override
    public boolean insertHistoryMember(LoginHistoryDTO loginHistoryDTO) {
        if(!isDuplicateMember(loginHistoryDTO.getMemberId())){
            return false;
        }
        return memberDAO.insertHistoryMember(loginHistoryDTO);
    }

    @Override
    public List<LoginHistoryDTO> selectHistoryList() {
        return memberDAO.selectHistoryList();
    }

    @Override
    public List<LoginHistoryDTO> selectSearchHistory(String memberId) {
        if(!isDuplicateMember(memberId)){
            return null;
        }
        return memberDAO.selectSearchHistory(memberId);
    }
}
