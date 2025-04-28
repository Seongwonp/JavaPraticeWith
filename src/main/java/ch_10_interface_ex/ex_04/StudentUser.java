package ch_10_interface_ex.ex_04;

import lombok.AllArgsConstructor;

/*
    1) StudentUser 클래스를 구현하세요.
        LibraryUser 인터페이스를 구현합니다.
        필드: name(이름), borrowedCount(현재 대출 수)
        학생은 최대 3권까지 대출할 수 있으며, 초과 시 "대출 한도 초과입니다." 메시지를 출력합니다.
        returnBook()은 대출 수를 1 감소시키며, 0일 경우 "반납할 책이 없습니다." 출력
 */

public class StudentUser implements LibraryUser {
    private String name;
    private int borrowedCount = 0;
    private int borrowedLimit = 3;

    public StudentUser(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook() {
        if (borrowedCount >= borrowedLimit) {
            System.out.println("[학생] " + this.name + " 대출 한도 초과입니다.");
            return;
        }
        System.out.println("[학생] " + this.name + " 책을 대출합니다. ( 현재 대출: " + ++borrowedCount + "권)");

    }

    @Override
    public void returnBook() {
        if (borrowedCount == 0) {
            System.out.println("[학생] " + this.name + " 반납할 책이 없습니다.");
            return;
        }
        System.out.println("[학생] " + this.name + " 책을 반납합니다. ( 현재 대출: " + --borrowedCount + "권)");

    }

    @Override
    public int getBorrowedCount() {
        return borrowedCount;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
