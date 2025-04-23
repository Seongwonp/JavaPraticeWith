package ch_02_var_data_type;


public class test03 {
    public static void main(String[] args) {
        /*
            int result = 에
            1) 변수 4개를 모두 사용하고
            2) 사칙연상중 + 연산만 사용해서 9가 나오도록 코드를 완성.
         */
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = (int)(var1 + var2 +var3) +(int)Double.parseDouble(var4);
        System.out.println(result); //9가 나와야함.

        int result2 = (int)var1 + (int)var2 + (int)(var3 + Double.parseDouble(var4));
        System.out.println(result2); //9

        int result3 = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
        System.out.println(result3);

        int result4 = (int)(var1 + var3 + Double.parseDouble(var4)) + (int)var2;
        System.out.println(result4); //9

        int result5 = (int)(var1 + var2 + Double.parseDouble(var4)) + (int)var3;
        System.out.println(result5);




    }
}
