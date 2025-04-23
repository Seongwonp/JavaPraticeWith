package ch_07_method;

public class My22 {
    //참조에 의한 호출방식 -> 매개변수의 타입이 참조형 타입일때 사용.

    public static void increase(int[] array){
            for (int i=0;i<array.length;i++){
                array[i]++;
                System.out.println("refArray["+ i + "]: " + array[i]);
            }
    }


    public static void main(String[] args) {
        int[] refArray = {100,800,1000};
        System.out.println("메서드 호출 전");
        for (int i = 0; i < refArray.length; i++) {
            System.out.println("refArray["+ i + "]: " + refArray[i]);
        }

        System.out.println("메서드 호출 후");
        increase(refArray);
    }
}
