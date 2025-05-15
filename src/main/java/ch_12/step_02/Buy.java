package ch_12.step_02;

public interface Buy {
    void buy();
    default void order(){
        System.out.println("Buy Order");
    }

}
