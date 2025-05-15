package ch_10.ch_10_abstract.t_ch_10_abstract_ex.ex_02;

import lombok.AllArgsConstructor;
import lombok.Getter;
/*
 1.	Transport 추상 클래스를 정의하세요.
    필드: String name, int capacity (생성자로 초기화)
    추상 메서드: void move(), void showInfo()
 */
@AllArgsConstructor
@Getter
abstract public class Transport {
    private String name;
    private int capacity;

    abstract void move();
    abstract void showInfo();

}
