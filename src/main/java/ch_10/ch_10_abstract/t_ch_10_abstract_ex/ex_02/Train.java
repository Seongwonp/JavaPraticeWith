package ch_10.ch_10_abstract.t_ch_10_abstract_ex.ex_02;

import lombok.extern.log4j.Log4j2;

/*
     2.	다음 클래스를 Transport 클래스를 상속받아 작성하세요.
    •	Train: “레일을 따라 달립니다”, “기차 - 이름: OO, 정원: OO명”
 */
@Log4j2
public class Train extends Transport{

    public Train(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move(){
       log.info("The train moves along the rails.");
    }

    @Override
    public void showInfo(){
        log.info("Train - name:" + getName() + ", capacity: " + getCapacity());
    }
}
