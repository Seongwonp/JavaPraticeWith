package ch_39_design_patton.part_06_mvc.Library.dao;

import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
class bookDAOImplTest {
    BookDAO bookDAO = new BookDAOImpl();
    @Test
    void insertBook() {
        BookDTO bookDTO = BookDTO.builder().title("test").author("test").build();
        log.info(bookDAO.insertBook(bookDTO));
    }

    @Test
    void updateBook() {
        log.info(bookDAO.updateBook(1));

    }

    @Test
    void listBooks() {
       List<BookDTO> books = bookDAO.selectAllBooks();
       log.info(books);

    }


}