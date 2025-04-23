package ch_05_loop;
public class My14 {
    public static void main(String[] args) {
        //continue문은 현재의 반복문을 뛰어넘고 다음 반복을 진행.

        //ex)0~100까ㅣ의 홀수만 더함
        int sum=0;
        for(int i = 0 ; i<=100 ; i++){
            if(i%2==0){
                continue; //짝수는 더하지 않고 건너뜀
            }
            sum+=i;
        }
        System.out.println("0부터 100까지의 홀수의 합은 " + sum + "입니다.");
    }
}
