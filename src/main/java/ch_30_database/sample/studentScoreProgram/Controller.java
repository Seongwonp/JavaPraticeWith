package ch_30_database.sample.studentScoreProgram;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

@Log4j2
public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final Service service = new Service();

    public void run() {
        printMenu();
    }

    private void printMenu() {
        while (true) {
            System.out.println("\n=== Student System ===");
            System.out.println("1. 학생등록");
            System.out.println("2. 학생목록");
            System.out.println("3. 성적입력");
            System.out.println("4. 성적조회");
            System.out.println("5. 전체평균");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> printAddStudent();
                case 2 -> printStudents();
                case 3 -> printAddScore();
                case 4 -> printGetScore();
                case 5 -> printTotalAverage();
                case 6 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private void printAddStudent() {
        log.info("학생 등록");
        // 학생 등록 로직 구현
        System.out.println("--------------");
        System.out.println("학생등록");
        System.out.println("--------------");
        System.out.print("학번: ");
        String studentId = scanner.nextLine();
        System.out.print("이름: ");
        String studentName = scanner.nextLine();
        StudentDTO student = StudentDTO.builder().studentId(studentId).name(studentName).build();
        if(!service.addStudent(student)) {
            System.out.println("같은 학번의 학생이 존재합니다!");
            return;
        }
        System.out.println("결과: 학생이 등록되었습니다.");
    }
    private void printStudents() {
        log.info("학생 목록");
        System.out.println("--------------");
        System.out.println("학생목록");
        System.out.println("--------------");
        Map<StudentDTO, BigDecimal>students = service.getAllStudents();

        students.forEach((student, score) -> {
            System.out.println("학번: " + student.getStudentId() + " / 이름: " + student.getName() + " / 평균점수: " + ((score==null)? "입력 전" : score));
        });
    }
    private void printAddScore() {
        log.info("성적 입력");
        // 성적 입력 로직 구현
        System.out.println("--------------");
        System.out.println("성적입력");
        System.out.println("--------------");
        ScoreDTO score = new ScoreDTO();
        System.out.print("학번: ");
        score.setStudentId(scanner.nextLine());
        System.out.print("국어: ");
        score.setKorean(Integer.parseInt(scanner.nextLine()));
        System.out.print("영어: ");
        score.setEnglish(Integer.parseInt(scanner.nextLine()));
        System.out.print("수학: ");
        score.setMath(Integer.parseInt(scanner.nextLine()));
        if(!service.addScore(score)) {
            System.out.println("[ERROR] 존재하지 않는 학번입니다!");
            return;
        }
        System.out.println("결과: 성적이 입력되었습니다.");
    }
    private void printGetScore() {
        log.info("성적 조회");
        // 성적 조회 로직 구현
        System.out.println("--------------");
        System.out.println("성적조회");
        System.out.println("--------------");
        System.out.print("조회할 학생의 학번을 입력하세요: ");
        String studentId = scanner.nextLine();
        Map<ScoreDTO,String>students = service.selectScore(studentId);
        if (students == null || students.isEmpty()) {
            System.out.println("[ERROR] 해당 학번의 성적 정보가 없습니다.");
            return;
        }
        students.forEach((score, name) -> {
            System.out.println("이름: " + name);
            System.out.println("국어: " + score.getKorean() + " / 영어: " + score.getEnglish() + " / 수학: " + score.getMath() + " / 평균: " + score.getAvg());
        });

    }
    private void printTotalAverage() {
        log.info("전체 평균");
        // 전체 평균 계산 로직 구현
        System.out.println("--------------");
        System.out.println("전체 평균 점수");
        System.out.println("--------------");
        System.out.println("전체 평균: " + service.getTotalAvgScore());
    }
}

