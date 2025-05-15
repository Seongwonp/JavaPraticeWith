package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_04;
/*
    2) LibraryUser 인터페이스를 정의하세요.
         User 인터페이스를 상속합니다.
         다음 메서드를 추가로 선언합니다:
         void borrowBook();
         void returnBook();
         int getBorrowedCount();
 */
public interface LibraryUser extends User {
    void borrowBook();
    void returnBook();
    int getBorrowedCount();
}
