package ch_31_collection.t_ch_31_collection_ex.ex_02;

import java.util.ArrayList;
import java.util.Scanner;

/*
            1.	UserDTO 클래스를 생성한다. 이 클래스는 다음 필드를 가진다:
        •	String userId
        •	String name
        •	int age
        •	String job
        2.	Main 클래스에서 Scanner를 이용해 사용자로부터 3명의 회원 정보를 입력받는다.
        3.	입력받은 각 회원 정보를 UserDTO 객체로 만들어 ArrayList<UserDTO>에 저장한다.
        4.	입력이 끝난 후, 회원 목록을 출력한다. 출력 포맷은 다음과 같다:
                ------------ USER LIST -------------
        [1] ID: user01 / Name: 철수 / Age: 20 / Job: 학생
        [2] ID: user02 / Name: 영희 / Age: 25 / Job: 디자이너

 */
import java.util.*;
public class Test {
    private static final int MAX_PEOPLE = 2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<UserDTO> list = new ArrayList<>();
        String userId, name, job;
        int age;
        for(int i=1; i<=MAX_PEOPLE ; i++){
            System.out.println("[" + i + "]");
            System.out.print("Input UserId: ");
            userId = scanner.nextLine();
            System.out.print("Input your name: ");
            name = scanner.nextLine();
            System.out.print("Input Age: ");
            try {
                 age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid age");
                i--;
                continue;
            }
            System.out.print("Input your Job: ");
            job = scanner.nextLine();
            list.add(new UserDTO(userId, name, age, job));
            System.out.println();
        }



        System.out.println("------------ USER LIST -------------");

        for(UserDTO user : list){
            int index = list.indexOf(user) + 1;
            System.out.println("[" + index + "] " + user);
        }
    }
}
