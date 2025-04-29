package ch_20_execption.create_exception.ex_01;
//사용자 정의 예외처리
class NegativeException extends Exception {
    NegativeException() {
        super("[Exception]: Negative numbers are not allowed!!!");
    }
}

public class Test {
    static int calcSum(int to) throws NegativeException {
        if(to<0){
            throw new NegativeException();
        }
        int sum =0;
        for(int i=1;i<=to;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calcSum(-10));
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}
