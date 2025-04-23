package ch_08_class_ex.ex06;

public class Tv {

    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    //TV 전원 유무
    private boolean checkPower() {
        if (!isPowerOn) {
            System.out.println("TV is turned off");
            return true;
        }
        return false;
    }

    //TV 전원
    void turnOnOff(){
        isPowerOn = !isPowerOn;
    }

    //불륨증가
    void volumeUp(){
        if (checkPower()) return;
        System.out.println(volume < MAX_VOLUME ? "Volume: " + ++volume : "Volume is already at maximum.");
    }

    //불륨감소
    void volumeDown(){
        if (checkPower()) return;
        System.out.println(volume > MIN_VOLUME ? "Volume: " + --volume : "Volume is already at minimum.");
    }

    //체널 up
    void channelUp(){
        if (checkPower()) return;
        System.out.println(channel < MAX_CHANNEL ? "Channel: " + ++channel : "Channel is already at maximum.");
    }

    //체널 Down
    void channelDown(){
        if (checkPower()) return;
        System.out.println(channel > MIN_CHANNEL ? "Channel: " + --channel : "Channel is already at minimum.");
    }

    void printStatus() {
        System.out.println("\nPower: " + (isPowerOn ? "ON" : "OFF"));
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        System.out.println();
    }
}
