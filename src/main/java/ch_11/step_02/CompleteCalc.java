package ch_11.step_02;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return (num2 != 0) ? num1 / num2 : Calc.ERROR;
    }

    public void showInfo(){
        System.out.println("Crated Calc Interface");
    }
}
