package ch_30_database.sample.studentScoreProgram;

import java.math.BigDecimal;

public interface ScoreDAO {
    boolean insertScore(ScoreDTO scoreDTO);
    ScoreDTO selectScore(String studentId);
    BigDecimal selectTotalAvgScore();
}
