package ch_39_design_patton.part_02_adapter.part_02_Use_Adapter;

public class AdapterServiceStudyStudent implements AdapterService{
    StudyStudent studyStudent = new StudyStudent();
    @Override
    public void run() {
       studyStudent.runStudy();
    }
}
