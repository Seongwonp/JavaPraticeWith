package ch_39_design_patton.part_06_mvc.Library.service;

import ch_39_design_patton.part_06_mvc.Library.dao.BookDAO;
import ch_39_design_patton.part_06_mvc.Library.dao.BookDAOImpl;
import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class BookServiceImpl implements BookService {
    private final BookDAO bookDAO = new BookDAOImpl();
    @Override
    public boolean addBook(BookDTO bookDTO) {
        log.info("bookDTO? {}",bookDTO);
        List<BookDTO> foundBooks = bookDAO.selectSearchBook("title", bookDTO.getTitle());
        if (foundBooks != null && !foundBooks.isEmpty()) {
            System.out.println("[ERROR] 이미 존재하는 책입니다!");
            return false;
        }
        return bookDAO.insertBook(bookDTO);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookDAO.selectAllBooks();
    }

    @Override
    public List<BookDTO> searchBooks(String type, String value) {
        if(!type.equals("bookId") && !type.equals("author") && !type.equals("title")) {
            System.out.println("[ERROR] 잘못된 검색 타입입니다.");
            return null;
        }
        List<BookDTO> results = bookDAO.selectSearchBook(type, value);
        if(results == null || results.isEmpty()) {
            System.out.println("책이 존재하지 않습니다!");
            return null;
        }
        return results;
    }

    @Override
    public boolean updateBook(int bookId, String op) {
        List<BookDTO> bookDTOList = searchBooks("bookId",String.valueOf(bookId));
        if(bookDTOList == null || bookDTOList.isEmpty()) {
            System.out.println("[ERROR] 해당 도서번호에 대한 책이 존제하지 않습니다!");
            return false;
        }
        BookDTO bookDTO = bookDTOList.get(0);
        if(op.equals("rent")){
            if(bookDTO.isRented()) {
                System.out.println("[ERROR] 이미 대출중인 책입니다!");
                return false;
            }
        } else if(op.equals("return")){
            if(!bookDTO.isRented()) {
                System.out.println("[ERROR] 이미 반납된 책입니다!");
                return false;
            }
        } else {
            System.out.println("[ERROR] 잘못된 작업 요청입니다! (rent 또는 return만 허용)");
            return false;
        }
        return bookDAO.updateBook(bookId);
    }
}
