package ch_07_method;

public class My13 {

    public static void setAddress(String addr){
        addr = "경기도 수원시 장안구";
    }

    public static String setAdDress(String addr){
        addr = "경기도 수원시 장안구";
        return addr;
    }

    public static void main(String[] args) {
        String address = "서울시 강남구 논현동";

        System.out.println("매서드 호출 전");
        System.out.println("address: " + address);

        setAddress(address);

        System.out.println("\nvoid 매서드 호출 후");
        System.out.println("Void address: " + address); //return 값이 없기때문에 그대로임!!!

        address = setAdDress(address);
        System.out.println("\nString 매서드 호출 후");
        System.out.println("String address: " + address); //return 값이 있기때문에 바뀜
    }
}
