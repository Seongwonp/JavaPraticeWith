package ch_39_design_patton.part_02_adapter.part_02_Use_Adapter;

public class AdapterServiceWorkMan implements AdapterService{
    WorkMan workMan = new WorkMan();
    @Override
    public void run() {
        workMan.runWork();
    }
}
