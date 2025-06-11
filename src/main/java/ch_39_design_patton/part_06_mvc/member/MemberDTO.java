package ch_39_design_patton.part_06_mvc.member;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String memberId;
    private String passwd;
    private String name;
}
