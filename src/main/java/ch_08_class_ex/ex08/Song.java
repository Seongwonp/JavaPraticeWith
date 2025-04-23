package ch_08_class_ex.ex08;

public class Song {
    private String name; //노래 제목
    private String artist; // 가수
    private int length; //곡의 길이(단위: 초)
    private String url;

    public Song(String name, String artist, int length, String url){
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.url = url;
    }

    public Song(String name, String artist, int length){
        this.name = name;
        this.artist = artist;
        this.length = length;
    }

    public Song(String name, String artist){
        this.name = name;
        this.artist = artist;
    }

    public Song(String name){
        this.name = name;
    }

    public Song(){

    }

    public void play() {
        if (url != null) {
            try {
                System.out.println(artist + "의 " + name +"을 재생합니다.");
                java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
            } catch (Exception e) {
                System.out.println("노래를 재생할 수 없습니다: " + e.getMessage());
            }
        } else {
            System.out.println("노래 URL이 없습니다.");
        }
    }

    @Override
    public String toString(){
        return "Song{name= '" + name + "', artist= '" + artist + "', length= " + length + "}";
    }

}
