package ch_30_database.sample.studentScoreProgram;

import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Log4j2
public class Service {
    private final ScoreDAO scoreDAO = new ScoreDAOImpl();
    private final StudentDAO studentDAO = new StudentDAOImpl();

    public StudentDTO selectStudentById(String studentId) {
        return studentDAO.selectStudentById(studentId);
    }


    public boolean addStudent(StudentDTO studentDTO) {
        if(selectStudentById(studentDTO.getStudentId()) != null) {
            return false;
        }
        return studentDAO.insertStudent(studentDTO);
    }

    public Map<StudentDTO, BigDecimal> getAllStudents() {
        Map<StudentDTO, BigDecimal> students = new HashMap<>();
        List<StudentDTO> studentDTOs = studentDAO.selectAllStudents();
        studentDTOs.forEach(studentDTO -> {
            students.put(studentDTO,getAvgScore(studentDTO.getStudentId()));
        });
        return students;
    }

    public boolean addScore(ScoreDTO scoreDTO) {
        if(selectStudentById(scoreDTO.getStudentId()) == null) {
            return false;
        }
        BigDecimal avg = BigDecimal.valueOf(scoreDTO.getKorean())
                .add(BigDecimal.valueOf(scoreDTO.getEnglish()))
                .add(BigDecimal.valueOf(scoreDTO.getMath()))
                .divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);
        scoreDTO.setAvg(avg);
        return scoreDAO.insertScore(scoreDTO);
    }


    public Map<ScoreDTO, String> selectScore(String studentId) {
        Map<ScoreDTO, String> studentScores = new HashMap<>();
        ScoreDTO scoreDTO = scoreDAO.selectScore(studentId);
        StudentDTO studentDTO = studentDAO.selectStudentById(studentId);
        if (scoreDTO == null || studentDTO == null) {
            return null;
        }
        studentScores.put(scoreDTO, studentDTO.getName());
        return studentScores;
    }

    public BigDecimal getAvgScore(String studentId) {
        ScoreDTO scoreDTO = scoreDAO.selectScore(studentId);
        if(scoreDTO == null) {
            return null;
        }
        return scoreDTO.getAvg();
    }

    public BigDecimal getTotalAvgScore(){
        return scoreDAO.selectTotalAvgScore().divide(BigDecimal.valueOf(1), 2, RoundingMode.HALF_UP);
    }

}
