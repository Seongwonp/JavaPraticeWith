package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_03;
import lombok.AllArgsConstructor;

/*
   2) AudioBook 클래스를 구현하세요.
	- Playable 인터페이스를 구현합니다.
	- title과 author를 필드로 가집니다.
	- 생성자를 통해 값을 초기화하세요.
	- getTitle()은 title을 반환합니다.
	- play()는 다음 메시지를 출력합니다:
       ex) [제목] - [저자] 오디오북을 재생합니다.
	- stop()은 다음 메시지를 출력합니다:
       ex) 오디오북 정지
 */

@AllArgsConstructor
public class AudioBook implements Playable {
    private String title;
    private String author;
    @Override
    public void play() {
        System.out.println("[ " +this.title + " ] - " + "[ " + this.author + " ]: Play AudioBook");
    }

    @Override
    public void stop() {
        System.out.println("[ " + this.title + " ]: AudioBook stopped....");
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
