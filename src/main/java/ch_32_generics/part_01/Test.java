package ch_32_generics.part_01;

public class Test {
    public static void main(String[] args) {
        /*
            제네릭(Generics)
            - 클래스/메서드를 정의할 때 타입을 파라미터로 받는 기능
            - 컴파일 시점에 타입 체크 → 런타임 ClassCastException 방지
            - <T> : 타입 파라미터 (Type Parameter). 관례상 T, E, K, V 등을 사용
         */

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        String s = strBox.get(); // 캐스팅 불필요
        System.out.println(strBox);

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        int n = intBox.get();
        System.out.println(intBox);

        // 제네릭 미사용 시: Object로 받아서 매번 캐스팅 필요 → 타입 안전성 X
        Box<Object> rawBox = new Box<>();
        rawBox.set("위험한 캐스팅");
        String unsafe = (String) rawBox.get(); // 명시적 캐스팅
        System.out.println("Object Box: " + unsafe);
    }
}
