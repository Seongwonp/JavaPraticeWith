package ch_30_database.sample.studentScoreProgram;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
public class ScoreDAOImpl implements ScoreDAO {


    @Override
    public boolean insertScore(ScoreDTO scoreDTO) {
        String SQL = "INSERT INTO score(studentId, Korean, English, Math, avg) VALUES (?, ?, ?, ?, ?)";
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, scoreDTO.getStudentId());
            preparedStatement.setInt(2, scoreDTO.getKorean());
            preparedStatement.setInt(3, scoreDTO.getEnglish());
            preparedStatement.setInt(4, scoreDTO.getMath());
            preparedStatement.setBigDecimal(5, scoreDTO.getAvg());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public ScoreDTO selectScore(String studentId) {
        String SQL = "SELECT * FROM score WHERE studentId = ?";
        ScoreDTO scoreDTO = null;
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, studentId);
            @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                scoreDTO = new ScoreDTO();
                scoreDTO.setStudentId(resultSet.getString("studentId"));
                scoreDTO.setKorean(resultSet.getInt("Korean"));
                scoreDTO.setEnglish(resultSet.getInt("English"));
                scoreDTO.setMath(resultSet.getInt("Math"));
                scoreDTO.setAvg(resultSet.getBigDecimal("avg"));
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return scoreDTO;
    }

    @Override
    public BigDecimal selectTotalAvgScore() {
        String SQL = "SELECT AVG(avg) AS avg FROM score";
        BigDecimal averageScore = null;
        try {
            @Cleanup Connection connection = DBConnection.getConnection();
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                averageScore = new BigDecimal(resultSet.getString("avg"));
            }
        }catch (SQLException e) {
            log.error(e.getMessage());
        }
        return averageScore;
    }


}
