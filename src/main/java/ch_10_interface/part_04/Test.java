package ch_10_interface.part_04;

public class Test {
    public static void main(String[] args){

        Player[] players = new Player[2];
        players[0] = new VideoPlayer();
        players[1] = new MusicPlayer();

        for(Player p : players){
            p.play();
            p.stop();
        }

        VideoPlayer[] vp = new VideoPlayer[4];
        for(int i = 0; i < vp.length; i++){
            vp[i] = new VideoPlayer();
        }

        vp[vp.length-1].printInfo(); // id: 5
    }
}
