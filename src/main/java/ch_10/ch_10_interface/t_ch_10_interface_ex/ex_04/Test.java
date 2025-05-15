package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_04;
/*

* 도서관 대출 시스템
도서관에서는 사용자 유형에 따라 책을 빌릴 수 있는 한도가 다릅니다.
다음 조건에 맞게 도서관 대출 시스템을 인터페이스 기반으로 구현하세요.

3. Test 클래스 작성
LibraryUser 타입의 참조 변수 2개를 선언하고, 각각 StudentUser와 ProfessorUser 객체를 생성하여 대입합니다.
각 객체에 대해 다음과 같은 테스트를 수행하세요:
연속으로 borrowBook()을 호출해 한도 초과 테스트
returnBook()을 여러 번 호출해 반납 동작 확인

예시:
[학생] 김철수 책을 대출합니다. (현재 대출: 1권)
[학생] 김철수 책을 대출합니다. (현재 대출: 2권)
[학생] 김철수 책을 대출합니다. (현재 대출: 3권)
[학생] 김철수 대출 한도 초과입니다.
[학생] 김철수 책을 반납합니다. (현재 대출: 2권)
[학생] 김철수 책을 반납합니다. (현재 대출: 1권)
[학생] 김철수 책을 반납합니다. (현재 대출: 0권)
[학생] 김철수 반납할 책이 없습니다.

[교수] 박영희 책을 대출합니다. (현재 대출: 1권)
[교수] 박영희 책을 대출합니다. (현재 대출: 2권)
[교수] 박영희 책을 대출합니다. (현재 대출: 3권)
[교수] 박영희 책을 대출합니다. (현재 대출: 4권)
[교수] 박영희 책을 대출합니다. (현재 대출: 5권)
[교수] 박영희 대출 한도 초과입니다.
 */

public class Test {
    public static void main(String[] args) {
        LibraryUser student = new StudentUser("김철수");
        student.borrowBook();
        student.borrowBook();
        student.borrowBook();
        student.borrowBook();
        student.returnBook();
        student.returnBook();
        student.returnBook();
        student.returnBook();

        LibraryUser professor = new ProfessorUser("박영희");
        professor.borrowBook();
        professor.borrowBook();
        professor.borrowBook();
        professor.borrowBook();
        professor.borrowBook();
        professor.borrowBook();
        professor.returnBook();
        professor.returnBook();
        professor.returnBook();
        professor.returnBook();
        professor.returnBook();
        professor.returnBook();



    }
}
