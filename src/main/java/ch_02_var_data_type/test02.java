package ch_02_var_data_type;

public class test02 {
    public static void main(String[] args) {

        /*
          문제1. 다음 조건에 맞게 변수들을 선언하고 값을 저장한 뒤, System.out.println()을 사용하여 출력하세요.
           ✨ 조건:
                •	자동차 모델명은 “Hyundai Avante” (문자열)
                •	출시 연도는 2022 (정수)
                •	연비는 15.6 (실수)
                •	전기차 여부는 false (불리언)
                •	등급은 ‘A’ (문자)
            출력 예시:
            자동차 모델명: Hyundai Avante
            출시 연도: 2022
            연비: 15.6
            전기차 여부: false
            등급: A
            * 변수이름으로 저장된 데이터의 의미를 알수 있도록 지을 것
         */
        String model = "Hyundai Avante";
        int year = 2022;
        double gas_mileage = 15.6;
        boolean isElectronic = false;
        char grade = 'A';

        System.out.println("자동차 모델명: " + model);
        System.out.println("출시 연도: " + year);
        System.out.println("연비: " + gas_mileage);
        System.out.println("전기차 여부: " + isElectronic);
        System.out.println("등급: " + grade);


    }
}
