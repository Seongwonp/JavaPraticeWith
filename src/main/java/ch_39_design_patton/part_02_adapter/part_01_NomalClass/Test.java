package ch_39_design_patton.part_02_adapter.part_01_NomalClass;

class WorkMan{
    void runWork(){
        System.out.println("work");
    }
}
class StudyStudent{
    void runStudy(){
        System.out.println("study");
    }
}


public class Test {
    public static void main(String[] args) {
        WorkMan workMan = new WorkMan();
        StudyStudent studyStudent = new StudyStudent();

        //유사한 기능이라하더라도 새로운 클래스가 생성이 되면 메서드 사용법을 공부해야 함.
        workMan.runWork();
        studyStudent.runStudy();
    }
}
