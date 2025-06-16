package ch_39_design_patton.part_06_mvc.Library.dao;

import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;
import ch_39_design_patton.part_06_mvc.Library.util.DBConnection;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class BookDAOImpl implements BookDAO {

    @Override
    public boolean insertBook(BookDTO book) {
        String SQL = "INSERT INTO book(title ,author) VALUES(?,?)";
        try{
            @Cleanup Connection connection = DBConnection.getConnection();
            assert connection != null;
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateBook(int bookId) {
        String SQL = "UPDATE book SET rented  = NOT rented WHERE bookId=?";
        try{
            @Cleanup Connection connection = DBConnection.getConnection();
            assert connection != null;
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, bookId);
            return preparedStatement.executeUpdate() > 0;
        }catch(SQLException e){
            log.error(e.getMessage());
        }
        return false;
    }

    @Override
    public List<BookDTO> selectSearchBook(String type, String value) {
        String SQL = "SELECT * FROM book WHERE "+ type + "= ? ORDER BY bookId";
        List<BookDTO> books = new ArrayList<>();
        try{
            @Cleanup Connection connection = DBConnection.getConnection();
            assert connection != null;
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            if(type.equals("bookId")) {
                preparedStatement.setInt(1, Integer.parseInt(value));
            } else{
                preparedStatement.setString(1, value);
            }
            @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BookDTO book = new BookDTO();
                book.setBookId(resultSet.getInt("bookId"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setRented(resultSet.getBoolean("rented"));
                books.add(book);
            }
        }catch (SQLException e){
            log.error(e.getMessage());
        }
        return books;
    }

    @Override
    public List<BookDTO> selectAllBooks() {
        String SQL = "SELECT * FROM book ORDER BY bookId";
        List<BookDTO> books = new ArrayList<>();
        try{
            @Cleanup Connection connection = DBConnection.getConnection();
            assert connection != null;
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BookDTO book = new BookDTO();
                book.setBookId(resultSet.getInt("bookId"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setRented(resultSet.getBoolean("rented"));
                books.add(book);
            }
        }catch (SQLException e){
            log.error(e.getMessage());
        }
        return books;
    }

    @Override
    public boolean deleteBook(int bookId) {
        return false;
    }
}
