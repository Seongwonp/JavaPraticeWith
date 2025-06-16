package ch_30_database.sample.studentScoreProgram;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Log4j2
class StudentDAOImplTest {
    StudentDAOImpl studentDAO = new StudentDAOImpl();
    @Test
    void insertStudent() {
        StudentDTO studentDTO = StudentDTO.builder().
                studentId("1001")
                .name("홍길동")
                .grade(2)
                .build();
        log.info(studentDAO.insertStudent(studentDTO));
    }

    @Test
    void selectAllStudents() {
    }
}