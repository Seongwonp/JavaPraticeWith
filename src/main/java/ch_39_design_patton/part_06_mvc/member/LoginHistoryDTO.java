package ch_39_design_patton.part_06_mvc.member;


import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginHistoryDTO {
    private int no;
    private String memberId;
    private boolean success;
    private LocalDateTime createdAt;
}
