package ch_10.ch_10_interface.part_05;

public class Test {
    public static void main(String[] args) {
        Wearable[] wearables = new Wearable[3];
        wearables[0] = new WearableComputer("HAL");
        wearables[1] = new WearableRobot(Color.RED);
        wearables[2] = new WearableRobot(Color.GREEN);

        for (Wearable wearable : wearables) {
            wearable.putOn();
            wearable.putOff();
            if(wearable instanceof Color){
                ((Color)wearable).changeColor(Color.BLUE);
            }
            System.out.println();
        }

    }
}
