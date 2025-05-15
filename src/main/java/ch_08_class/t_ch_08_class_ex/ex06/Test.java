package ch_08_class.t_ch_08_class_ex.ex06;

public class Test {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.turnOnOff();
        System.out.println("TV ON");

        tv.channel = 10;
        tv.volume = 99;
        tv.printStatus();

        tv.turnOnOff();
        tv.volumeUp();

        tv.printStatus();

        tv.turnOnOff();
        tv.volumeUp();
        tv.channel = 99;

        tv.channelUp();
        tv.channelUp();
        tv.channelDown();
        tv.volumeDown();


        tv.printStatus();
        tv.turnOnOff();
        System.out.println("TV OFF");

    }
}
