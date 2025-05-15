package ch_10.ch_10_interface.part_04;

public class VideoPlayer implements Player{
    private static int count = 0;
    private int id;

    public VideoPlayer(){
        id = ++count;
    }

    @Override
    public void play() {
        System.out.println("["+id+"] Play video");
    }

    @Override
    public void stop() {
        System.out.println("["+id+"] Video stopped...... ");
    }

    public void printInfo(){
        System.out.println("This deviceNumber is [ "+ id + "]." );
    }
}
