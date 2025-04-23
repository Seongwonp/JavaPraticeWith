package ch_02_var_data_type;

public class My11 {
    public static void main(String[] args) {
        /*
            문자열을 기본 타입으로 강제 타입 변환 .
         */

        String str1 = "10";
        byte value1 = Byte.parseByte(str1);
        System.out.println(value1);

        String str2 = "200";
        short value2 = Short.parseShort(str2);
        System.out.println(value2);

        String str3 = "300000";
        int  value3 = Integer.parseInt(str3);
        System.out.println(value3);

        //String->long
        String str4 = "4000000000";
        long value4 = Long.parseLong(str4);
        System.out.println(value4);

        String str5 = "12.345";
        float value5 = Float.parseFloat(str5);
        System.out.println(value5);


        String str6 = "12.345";
        double value6 = Double.parseDouble(str6);
        System.out.println(value6);

        String str7  = "true";
        boolean value7 = Boolean.parseBoolean(str7);
        System.out.println(!value7);

        //변환할려는 데이터 타입외의 문자가 존제하면 변환이 되지않고 에러 발생

    }
}
