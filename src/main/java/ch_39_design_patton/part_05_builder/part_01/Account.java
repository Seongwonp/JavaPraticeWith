package ch_39_design_patton.part_05_builder.part_01;

import java.util.Locale;

public class Account {
    /*
        Builder 패턴 : 객체 생성 과정과 표현 방법을 분리하여 동일한 생성절차에서 서로 다른 표현 결과를 얻을 수 있게 하는 패턴을 의미.
        Java 에서 객체의 초기화와 생성을 캡슐화하는 데 유용하게 사용.
     */
    private int accId; //계좌 아이디
    private int balance; // 잔 액
    private String cusName; // 고객이름

    //모든 필드를 사용하는 생성자가 필요
    public Account(int accId, int balance, String cusName) {
        this.accId = accId;
        this.balance = balance;
        this.cusName = cusName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", balance=" + balance +
                ", cusName='" + cusName + '\'' +
                '}';
    }

    public static class Builder{
        private int accId;
        private int balance;
        private String cusName;

        // 기본 생성자: Builder 객체를 생성할 때 사용됨
        Builder(){}

        // 계좌 ID 설정 메서드
        public Builder accId(int accId){
            this.accId = accId;
            return this;
        }

        // 잔액 설정 메서드
        public Builder balance(int balance){
            this.balance = balance;
            return this;
        }

        // 고객 이름 설정 메서드
        public Builder cusName(String cusName){
            this.cusName = cusName;
            return this;
        }

        // 최종적으로 Account 객체 생성 메서드
        public Account build(){
            return new Account(accId, balance, cusName);
        }
    }


}
