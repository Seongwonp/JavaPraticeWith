package ch_39_design_patton.part_06_mvc.Library.service;

import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class BookServiceImplTest {
    BookService bookService = new BookServiceImpl();
    @Test
    void addBook() {
        BookDTO bookDTO = BookDTO.builder().title("test1").author("test1").build();
        log.info(bookService.addBook(bookDTO));
    }
}