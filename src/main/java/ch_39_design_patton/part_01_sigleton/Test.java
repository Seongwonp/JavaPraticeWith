package ch_39_design_patton.part_01_sigleton;

public class Test {
    public static void main(String[] args) {
        /*
            4. 외부에서 사용하는 코드 만들기.
            외부 클래스에서 Company를 생성할 수 없으므로 static으로 제공되는 getInstance()메서드를 호출.
         */
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1 == company2); //true
        //동일한 주소의 인스턴스가 나옴 -> 하나의 클래스만 만들어졌다.(싱글턴)
        System.out.println(company1.hashCode());
        System.out.println(company2.hashCode());
    }

}
