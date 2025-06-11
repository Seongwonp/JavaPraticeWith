package ch_39_design_patton.part_06_mvc.member;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class Controller {
    private final MemberService memberService = new MemberServiceImpl();
    private final Scanner scanner = new Scanner(System.in);
    private boolean isLogin = false;
    public void run(){ printMenu();}
    private void printMenu() {
        while (true) {
            System.out.println("========= Login System =========");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 로그아웃");
            System.out.println("4. 회원 목록");
            System.out.println("5. 회원 검색");
            System.out.println("6. 로그인내역 검색");
            System.out.println("7. 회원 로그인내역 검색");
            System.out.println("8. 종료");
            System.out.println("================================");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> signUp();
                case 2 -> login();
                case 3 -> logout();
                case 4 -> listMembers();
                case 5 -> selectMember();
                case 6 -> historyLogin();
                case 7 -> searchHistory();
                case 8->{
                    System.out.println("End program...");
                    return;
                }
                default ->{
                    System.out.println("Invalid choice");
                    return;
                }
            }
        }
    }
    private void signUp() {
        log.info("sign up");
        if(isLogin){
            System.out.println("이미 로그인이 되어있습니다!!");
            return;
        }
        System.out.print("아이디: ");
        String memberId = scanner.nextLine();
        if(memberService.isDuplicateMember(memberId)) {
            System.out.println("이미 존제하는 아이디입니다!");
            return;
        }
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        if(memberService.addMember(new MemberDTO(memberId, password, name))) {
            System.out.println("계정이 생성되었습니다.");
        } else {
            System.out.println("계정 생성에 실패하였습니다.");
        }
    }
    private void login() {
        log.info("login");
        LoginHistoryDTO historyDTO = new LoginHistoryDTO();
        System.out.print("아이디: ");
        String memberId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        if(memberService.selectMember(memberId, password)) {
            historyDTO.setMemberId(memberId);
            historyDTO.setSuccess(true);
            memberService.insertHistoryMember(historyDTO);
            System.out.println("로그인 되었습니다!");
            isLogin = true;
        } else{
            System.out.println("로그인에 실패 하였습니다.");
            historyDTO.setMemberId(memberId);
            historyDTO.setSuccess(false);
            memberService.insertHistoryMember(historyDTO);
        }
    }
    private void logout() {
        log.info("logout");
        if(!isLogin){
            System.out.println("로그인이 되어있지않습니다!");
            return;
        }
        System.out.println("로그아웃되었습니다.");
        isLogin = false;
    }
    private void listMembers() {
        log.info("list members");
        List<MemberDTO> members = memberService.selectAllMembers();
        System.out.println("===========Members List============");
        for (MemberDTO memberDTO : members) {
            System.out.println("아이디: " + memberDTO.getMemberId());
            System.out.println("이름: " + memberDTO.getName());
            System.out.println("===================================");
        }

    }
    private void selectMember() {
        log.info("select member");
        System.out.print("아이디: ");
        String memberId = scanner.nextLine();
        MemberDTO member = memberService.selectSearchMember(memberId);
        if(member.getMemberId() == null) {
            System.out.println(memberId + "회원이 존제하지 않습니다!");
            return;
        }
        System.out.println("===========Members List============");
        System.out.println("아이디: " + member.getMemberId());
        System.out.println("이름: " + member.getName());
        System.out.println("===================================");
    }
    private void historyLogin() {
        log.info("history login");
        List<LoginHistoryDTO> historyDTOList = memberService.selectHistoryList();
        System.out.println("===========Login History List============");
        historyDTOList.forEach(loginHistoryDTO -> {
            System.out.println("[ " + loginHistoryDTO.getNo() + " ]");
            System.out.println("아이디: " + loginHistoryDTO.getMemberId());
            System.out.println("로그인 유무: " + loginHistoryDTO.isSuccess());
            System.out.println("접속시간: " + loginHistoryDTO.getCreatedAt());
            System.out.println("==========================================");
        });
    }

    private void searchHistory() {
        log.info("search history");
        System.out.print("아이디를 입력하세요:");
        String memberId = scanner.nextLine();
        List<LoginHistoryDTO> historyDTOList = memberService.selectSearchHistory(memberId);
        System.out.println("===========\"" + historyDTOList.get(0).getMemberId()+ "\" Login History List============");
        historyDTOList.forEach(loginHistoryDTO -> {
            System.out.println("No: " + loginHistoryDTO.getNo());
            System.out.println("로그인 유무: " + loginHistoryDTO.isSuccess());
            System.out.println("접속시간: " + loginHistoryDTO.getCreatedAt());
            System.out.println("==========================================");
        });
    }


}
