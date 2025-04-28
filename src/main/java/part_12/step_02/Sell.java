package part_12.step_02;

public interface Sell {
    void sell();
    void info();
    default void order(){
        System.out.println("Sell order");
    }


}
