package ch_10.ch_10_interface.part_04;

public class MusicPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }

    public void clean(){
        System.out.println("Player cleared!");
    }
}
