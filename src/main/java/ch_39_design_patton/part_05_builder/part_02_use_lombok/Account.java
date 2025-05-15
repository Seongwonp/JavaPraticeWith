package ch_39_design_patton.part_05_builder.part_02_use_lombok;

import lombok.*;

//lombok을 사용하여 빌더 자동 생성
@Builder
@AllArgsConstructor
@ToString
public class Account {
    private int accId; //계좌 아이디
    private int balance; // 잔 액
    private String cusName; // 고객이름
}
