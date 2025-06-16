package ch_30_database.sample.studentScoreProgram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDTO {
    private String studentId;
    private int Korean;
    private int English;
    private int Math;
    private BigDecimal avg;
}
