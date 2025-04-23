package ch_02_var_data_type;

public class My09 {
    public static void main(final String[] args) {
        byte num1 = 127;
        int  num2 = num1; //자동 형변환(byte->int)
        System.out.println(num1++); // 오버플로우 그래서 잴 첨값으로 이동
        System.out.println(num1);
        System.out.println(num2);
        /*
         *   num3 = num2; //int -> byte 형변환은 안된다. (float->int)도 마찬가지
         *  System.out.println(num3);
         *
         */
        float num4 = num2;
        System.out.println(num4);

        //강제(명시적) 형변환
        int num5 = (int) num4;
        System.out.println(num5);

        int num11 = 263;
        byte num12 = (byte) num11;
        System.out.println(num12); //범위를 벗어나서 계산해보면 263-256 = 7

        float num13 = 3.84F;
        int num14 = (int) num13;
        System.out.println(num14);
    }
}
