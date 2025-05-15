package ch_31_collection.t_ch_31_collection_ex.ex_17_hashmap;

import java.util.*;

/*
    아이디와 비밀번호 검사하기
    아이디 비번을 입력을 받아서 map에 저장된 값과 비교를 해서
    1) 동일한 아이디 비번이 있는 경우에는 "로그인되었습니다."
    2) 동일한 아이디는 있는데 비번이 틀릴 경우 "비밀번호가 일치하지 않습니다."
    3) 동일한 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 가 출력되도록 하라.
    4) 로그인을 성공할 때 까지 계속 로그인을 요청하도록 하라.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        map.put("spring","12");
        map.put("summer","123");
        map.put("fall","1234");
        map.put("winter","12345");

        while(true){
            System.out.println("아이디와 비밀번호를 입력해 주세요.");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("PW: ");
            String password = scanner.nextLine();
            System.out.println();

            if(map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else{
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }

        }
    }
}
