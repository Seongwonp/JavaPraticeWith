package ch_30_database.sample.studentScoreProgram;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class ScoreDAOImplTest {
    ScoreDAO scoreDAO = new ScoreDAOImpl();
    @Test
    void insertScore() {
        ScoreDTO scoreDTO = ScoreDTO.builder().studentId("1001").Korean(90).English(98).Math(100).build();
        log.info(scoreDAO.insertScore(scoreDTO));

    }

    @Test
    void selectScore() {
    }
}