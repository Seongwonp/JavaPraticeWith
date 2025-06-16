package ch_30_database.sample.studentScoreProgram;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Log4j2
public class StudentDAOImpl implements StudentDAO {

    /*------------------------------- StudentDTO ------------------------------------- */

    @Override
    public boolean insertStudent(StudentDTO student) {
        String SQL = "INSERT INTO students(studentId, name, grade) VALUES (?, ?, ?)";
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, student.getStudentId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getGrade());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public List<StudentDTO> selectAllStudents() {
        String SQL = "SELECT * FROM students";
        List<StudentDTO> students = new ArrayList<>();
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentDTO student = new StudentDTO();
                student.setStudentId(resultSet.getString("studentId"));
                student.setName(resultSet.getString("name"));
                student.setGrade(resultSet.getInt("grade"));
                students.add(student);
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return students;
    }

    @Override
    public StudentDTO selectStudentById(String studentId) {
        String SQL = "SELECT * FROM students WHERE studentId = ?";
        StudentDTO studentDTO = null;
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                studentDTO = new StudentDTO();
                studentDTO.setStudentId(resultSet.getString("studentId"));
                studentDTO.setName(resultSet.getString("name"));
                studentDTO.setGrade(resultSet.getInt("grade"));
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return studentDTO;
    }

}
