package ch_08_class.part_16_account;

public class Account {
    private String name; //이름
    private String no; //계좌번호
    private int balance; //예금잔고

    public Account(String name, String no, int balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "계좌명의: " + name + ", 계좌번호: " + no + ", 예금잔고: " + balance;
    }


}
