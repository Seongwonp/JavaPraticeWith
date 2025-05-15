package ch_39_design_patton.part_06_mvc.banking;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    /*
     DTO: Data Transfer Object
     데이터를 담는 역할을 하는 클래스.
     데이터베이스를 이용하는 프로그램에서는
     1) 테이블에 저장할 데이터를 담거나, 2) 데이터베이스의 테이블에서 조회한 데이터를담는 역할을 함.
     그래서 테이블과 거의 동일한 형태로 멤버변수를 선언하고,
     기능(메서드)은 setter.getter 같은 기본 기능만 사용.
     */
    private String accountId;
    private String ownerName;
    private int balance;
    private LocalDateTime createdAt;
}
