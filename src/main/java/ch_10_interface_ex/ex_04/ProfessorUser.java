package ch_10_interface_ex.ex_04;

/*
    2) ProfessorUser 클래스를 구현하세요.
    LibraryUser 인터페이스를 구현합니다.
    필드: name(이름), borrowedCount(현재 대출 수)
    교수는 최대 5권까지 대출할 수 있으며, 그 외 처리 방식은 학생과 동일합니다.
 */
public class ProfessorUser implements LibraryUser {

    private String name;
    private int borrowedCount = 0;
    private int borrowedLimit = 5;

    public ProfessorUser(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook() {
        if (borrowedCount >= borrowedLimit) {
            System.out.println("[교수] " + this.name + " 대출 한도 초과입니다.");
            return;
        }
        System.out.println("[교수] " + this.name + " 책을 대출합니다. ( 현재 대출: " + ++borrowedCount + "권)");

    }

    @Override
    public void returnBook() {
        if (borrowedCount == 0) {
            System.out.println("[교수] " + this.name + " 반납할 책이 없습니다.");
            return;
        }
        System.out.println("[교수] " + this.name + " 책을 반납합니다. ( 현재 대출: " + --borrowedCount + "권)");

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
