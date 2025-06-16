package ch_39_design_patton.part_06_mvc.Library.controller;

import ch_39_design_patton.part_06_mvc.Library.dto.BookDTO;
import ch_39_design_patton.part_06_mvc.Library.service.BookService;
import ch_39_design_patton.part_06_mvc.Library.service.BookServiceImpl;
import lombok.extern.log4j.Log4j2;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

@Log4j2
public class Controller {
    private final BookService bookService = new BookServiceImpl();
    private final Scanner scanner = new Scanner(System.in);

    private void printMenu(){
       while(true){
           System.out.println("=== Book Rental System ===");
           System.out.println("1. 도서 등록");
           System.out.println("2. 도서 목록 조회(도서검색)");
           System.out.println("3. 도서 대여");
           System.out.println("4. 도서 반납");
           System.out.println("5. 대여 상태 조회");
           System.out.println("6. 종료");
           System.out.println("==========================");
           System.out.println("메뉴를 선택하세요!");
           System.out.print("선택>>> ");
           int option = Integer.parseInt(scanner.nextLine());
           switch (option) {
               case 1 -> addBook();
               case 2 -> searchBook();
               case 3 -> rentBook();
               case 4 -> returnBook();
               case 5 -> isRented();
               case 6 ->{
                   System.out.println("System End....");
                   return;
               }
               default -> System.out.println("[ERROR]올바른 옵션이 아닙니다!(1~6)");
           }
       }
    }

    private void addBook() {
        log.info("도서 등록");
        BookDTO bookDTO = new BookDTO();
        System.out.println("--------- 도서 등록 --------");
        System.out.print("책 제목을 입력하시오: ");
        bookDTO.setTitle(scanner.nextLine());
        System.out.print("저자를 입력하시오: ");
        bookDTO.setAuthor(scanner.nextLine());
        if(!bookService.addBook(bookDTO)){
            return;
        }
        System.out.println("결과: 도서가 추가 되었습니다!");
    }

    private void searchBook() {
        System.out.println("--------- 도서 검색 --------");
        System.out.println("1. 도서 전체 목록");
        System.out.println("2. 저자로 검색하기");
        System.out.println("3. 도서 번호로 검색하기");
        System.out.println("--------------------------");
        System.out.print("선택>> ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1 -> printAllBooks();
            case 2 -> printAuthorBooks();
            case 3 -> searchBookId();
            default -> System.out.println("[ERROR] 올바른 옵션을 선택해주세요!");
        }
    }

    private void printAllBooks(){
        List<BookDTO> books = bookService.getAllBooks();
        System.out.println("--------- book List --------");
        books.forEach((bookDTO) -> {
            System.out.println("ID: " + bookDTO.getBookId());
            System.out.println("Title: " + bookDTO.getTitle());
            System.out.println("Author: " + bookDTO.getAuthor());
            System.out.println("Rented: " + ((bookDTO.isRented())? "대출중" : "대출가능"));
            System.out.println("-----------------------------");
        });
    }
    private void printAuthorBooks(){
        System.out.print("저자 이름: ");
        String author = scanner.nextLine();

        List<BookDTO> books = bookService.searchBooks("author", author);
        System.out.println("---------[" + author + "] book List --------");
        books.forEach((bookDTO) -> {
            System.out.println("ID: " + bookDTO.getBookId());
            System.out.println("Title: " + bookDTO.getTitle());
            System.out.println("Author: " + bookDTO.getAuthor());
            System.out.println("Rented: " + ((bookDTO.isRented())? "대출중" : "대출가능"));
            System.out.println("-----------------------------------");
        });
    }

    private void searchBookId(){
        System.out.print("도서 번호: ");
        String bookId = scanner.nextLine();
        List<BookDTO> books = bookService.searchBooks("bookId", bookId);
        System.out.println("-----------------------------");
        books.forEach((bookDTO) -> {
            System.out.println("Title: " + bookDTO.getTitle());
            System.out.println("Author: " + bookDTO.getAuthor());
            System.out.println("Rented: " + ((bookDTO.isRented())? "대출중" : "대출가능"));
            System.out.println("-----------------------------------");
        });
    }


    private void rentBook(){
        System.out.println("--------- 도서 대출 --------");
        System.out.print("도서번호: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        if(!bookService.updateBook(bookId,"rent")){
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("결과: 대출되었습니다! (대출기한 2주)");
        System.out.println("대출 일시: " + year + "." + month + "." + day);

        // 대출기간 14일(2주)
        calendar.add(Calendar.DAY_OF_MONTH, 14);
        int returnYear = calendar.get(Calendar.YEAR);
        int returnMonth = calendar.get(Calendar.MONTH) + 1;
        int returnDay = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("반납 일시: " + returnYear + "." + returnMonth + "." + returnDay);
    }

    private void returnBook(){
        System.out.println("--------- 도서 반납 --------");
        System.out.print("도서번호: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        if(!bookService.updateBook(bookId,"return")){
            return;
        }
        System.out.println("결과: 반납되었습니다!");
    }

    private void isRented(){
        System.out.println("--------- 대출 여부 검색 ----------");
        System.out.print("도서번호: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        List<BookDTO> books = bookService.searchBooks("bookId", String.valueOf(bookId));
        if(books==null){
            return;
        }
        books.forEach((bookDTO) -> {
            System.out.println("[" + bookDTO.getBookId() + "] " + bookDTO.getTitle() + "(" + bookDTO.getAuthor() + ")");
            System.out.println("Rented: " + ((bookDTO.isRented())? "대출중" : "대출가능"));
        });
    }

    public void run(){
        printMenu();
    }
}
