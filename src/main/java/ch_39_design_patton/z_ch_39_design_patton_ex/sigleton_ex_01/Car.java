package ch_39_design_patton.z_ch_39_design_patton_ex.sigleton_ex_01;

import lombok.*;

/*
    2) Car()
    고유번호가 부여. 자동차 번호가 10001부터 시작되어 자동차가 생성될 때 마다 10002, 10003 번호가 붙도록 .
 */
@Getter
@AllArgsConstructor
public class Car {
    private final String carName;
    private final int carNumber;
}
