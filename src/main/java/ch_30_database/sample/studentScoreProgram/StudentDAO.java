package ch_30_database.sample.studentScoreProgram;

import java.math.BigDecimal;
import java.util.List;

public interface StudentDAO {
    boolean insertStudent(StudentDTO student);
    List<StudentDTO> selectAllStudents();
    StudentDTO selectStudentById(String studentId);
}
