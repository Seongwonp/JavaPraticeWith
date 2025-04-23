package ch_10_abstract_ex.ex_02;

import lombok.extern.log4j.Log4j2;

/*
 2.	다음 클래스를 Transport 클래스를 상속받아 작성하세요.
    •	Bus: move()는 “도로를 달립니다”, showInfo()는 “버스 - 이름: OO, 정원: OO명” 출력
 */

@Log4j2
public class Bus extends Transport {
    public Bus(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move(){
        log.info("The bus moves along the road.");
    }

    @Override
    public void showInfo(){
        log.info("Bus - name:" + getName() + ", capacity: " + getCapacity());
    }
}
