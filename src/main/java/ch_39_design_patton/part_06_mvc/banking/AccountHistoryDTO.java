package ch_39_design_patton.part_06_mvc.banking;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountHistoryDTO {
    private int no;
    private String accountId;
    private String part;
    private int money;
    private int balance;
    private LocalDateTime creatAt;

}
