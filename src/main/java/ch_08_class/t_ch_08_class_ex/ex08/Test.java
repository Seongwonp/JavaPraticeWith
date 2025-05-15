package ch_08_class.t_ch_08_class_ex.ex08;

public class Test {
    /*
    다중 생성자
    노래 한 곡을 나타내는 클래스 Song을 작성하라. 생성자에서 생성자를 호출하는 방식을 사용할 것.
    this()를 사용하라.
    Song 클래스는 다음과 같이 정의된다.
    # 필드
    title : 노래의 제목
    artist : 가수
    length : 곡의 길이 (단위: 초)
     */
    public static void main(String[] args) {
        Song song = new Song("TOO BAD","G-Dregon",360,"https://youtu.be/E0EgGbuuB-U?si=VeveTwCNOPPhd0Iv");
        Song song1 = new Song("HOT","LE SSERAFIM", 180);
        Song song2 = new Song("한 페이지가 될 수 있게","DAY6");
        Song song3 = new Song("ATTITUDE");
        Song song4 = new Song();

        System.out.println(song);
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        System.out.println(song3.toString());
        System.out.println(song4.toString());

        song.play();
        song1.play();
        song2.play();
        song3.play();
        song4.play();

    }



}
