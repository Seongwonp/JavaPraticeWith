package ch_03_operator;

public class Test01 {
    public static void main(String[] args) {
        /*
            연필 534자루가 있고, 학생 30명이 있음.
            학생들에게 연필을 똑같은 개수로 나누어 줄때
            1) 학생당 몇 개를 가질수 있고,
            2) 최종적으로 몇 개가 남는지 구하시오.
         */

        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students; //이곳에 코드를 수정하시오.
        System.out.println("학생 한 명이 가지는 연필 갯수: " + pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = pencils % students; // 이곳에 코드를 수정하시오.
        System.out.println("남은 연필 갯수: " + pencilsLeft);
    }
}
