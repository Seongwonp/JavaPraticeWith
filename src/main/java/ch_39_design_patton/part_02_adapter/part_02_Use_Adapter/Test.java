package ch_39_design_patton.part_02_adapter.part_02_Use_Adapter;

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
        AdapterService adapterServiceWorkMan = new AdapterServiceWorkMan();
        AdapterService adapterServiceStudyStudent = new AdapterServiceStudyStudent();

        adapterServiceWorkMan.run();
        adapterServiceStudyStudent.run();
    }
}
