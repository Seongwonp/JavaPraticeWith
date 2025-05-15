package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_03;

public class Test {
    /*
    3.	Main 클래스 작성
	- Playable 타입의 참조변수 p1, p2를 선언하고 각각 Podcast, AudioBook 인스턴스를 대입하세요.
	- 각각 play()와 stop()을 호출하세요.

	출력 예시
    [ 김영하의 책 읽는 시간 ] - [ 김영하 ]: Play Podcast
    [ 김영하의 책 읽는 시간 ]: Podcast stopped..
    [ 해리 포터와 마법사의 돌 ] - [ J.k. 롤링 ]: Play AudioBook
    [ 해리 포터와 마법사의 돌 ]: AudioBook stopped....

     */
    public static void main(String[] args) {
        Playable p1 = new Podcast("김영하의 책 읽는 시간","김영하");
        Playable p2 = new AudioBook("해리 포터와 마법사의 돌", "J.k. 롤링");
        p1.play();
        p1.stop();

        p2.play();
        p2.stop();
    }
}
