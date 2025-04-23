package ch_10_abstract_ex.ex_02;

import lombok.extern.log4j.Log4j2;

/*
     2.	다음 클래스를 Transport 클래스를 상속받아 작성하세요.
    •	Airplane: “하늘을 날아갑니다”, “비행기 - 이름: OO, 정원: OO명”
 */
@Log4j2
public class Airplane extends Transport {

    public Airplane(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move(){
        log.info("The airplane is flying in the sky");
    }

    @Override
    public void showInfo(){
        log.info("Airplane - name:" + getName() + ", capacity: " + getCapacity());
    }
}
