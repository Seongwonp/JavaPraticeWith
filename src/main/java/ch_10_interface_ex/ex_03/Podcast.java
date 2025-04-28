package ch_10_interface_ex.ex_03;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
     2.	클래스 구현
	1) Podcast 클래스를 구현하세요.
	- Playable 인터페이스를 구현합니다.
	- title과 host를 필드로 가집니다.
	- 생성자를 통해 값을 초기화하세요.
	- getTitle()은 title을 반환합니다.
	- play()는 다음 메시지를 출력합니다:
    ex) [제목] - [진행자] 팟캐스트를 재생합니다.
	-stop()은 다음 메시지를 출력합니다:
	ex) [제목] 팟캐스트 정지
 */
@AllArgsConstructor
public class Podcast implements Playable {
    private String title;
    private String host;


    @Override
    public void play() {
        System.out.println("[ " + this.title + " ] - " + "[ " + this.host + " ]: Play Podcast");
    }

    @Override
    public void stop() {
        System.out.println("[ " + this.title + " ]: Podcast stopped..");
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
