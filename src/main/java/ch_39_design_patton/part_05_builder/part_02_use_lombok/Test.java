package ch_39_design_patton.part_05_builder.part_02_use_lombok;

public class Test {
    public static void main(String[] args) {
                //계좌번호를 초기값으로 객체 생성
        Account account1 = Account.builder().accId(1111).build();
        System.out.println(account1);

        // 계좌번호, 잔액을 초기값으로 객체 생성
        Account account2 = Account.builder().balance(2000).accId(1112).build();
        System.out.println(account2);

        //계좌번호, 잔액, 예금주를 초기값으로 객체 생성
        Account account3 =  Account.builder().accId(1118).balance(200000).cusName("홍길동").build();
        System.out.println(account3);
        //잔액,  예금주를 초기값으로 객체 생성
        Account account4 =  Account.builder().balance(123000).cusName("김철수").build();
        System.out.println(account4);
        //예금주를 초기값으로 객체 생성
        Account account5 = Account.builder().cusName("김남일").build();
        System.out.println(account5);

    }
}
