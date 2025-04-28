package ch_10_interface.part_05;

public class WearableRobot implements Wearable, Color{
    private int color;

    public WearableRobot(int color) {
        changeColor(color);
    }

    public String getRobot(){
        return switch(color){
            case RED -> "red robot";
            case BLUE -> "blue robot";
            case GREEN -> "green robot";
            default -> "robot";
        };
    }


    @Override
    public void changeColor(int color) {
        this.color = color;
    }

    @Override
    public void putOn() {
        System.out.println(getRobot() + " put ON!!!!");
    }

    @Override
    public void putOff() {
        System.out.println(getRobot() + " put OFF!!!!");

    }
}
