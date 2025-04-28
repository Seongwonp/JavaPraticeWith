package ch_10_interface_ex.ex_03;
/*
	2) Playable 인터페이스를 정의하세요.
	- void play()
	- void stop()
	- Playable은 Media 인터페이스를 상속받습니다.
 */
public interface Playable extends Media {
    void play();
    void stop();

}
