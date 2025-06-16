package ch_39_design_patton.part_06_mvc.Library.service;

import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;

import java.util.List;

public interface BookService {
    boolean addBook(BookDTO bookDTO);
    List<BookDTO> getAllBooks();
    List<BookDTO> searchBooks(String type, String value);
    boolean updateBook(int bookId, String op);

}
