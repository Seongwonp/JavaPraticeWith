package ch_30_database.sample.studentScoreProgram;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class ServiceTest {
    Service service = new Service();
    @Test
    void insertStudent() {
    }

    @Test
    void insertScore() {
        ScoreDTO scoreDTO = ScoreDTO.builder().studentId("1001").Korean(85).English(95).Math(98).build();
        log.info(service.addScore(scoreDTO));
    }
}