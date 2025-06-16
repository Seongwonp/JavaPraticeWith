package ch_39_design_patton.part_06_mvc.Library.dao;


import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;

import java.util.List;

public interface BookDAO {
    boolean insertBook(BookDTO book);
    boolean updateBook(int bookId);
    List<BookDTO> selectSearchBook(String type, String value);
    List<BookDTO> selectAllBooks();
    boolean deleteBook(int bookId);



}
