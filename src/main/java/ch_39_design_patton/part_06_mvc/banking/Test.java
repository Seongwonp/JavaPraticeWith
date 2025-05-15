package ch_39_design_patton.part_06_mvc.banking;

public class Test {
    public static void main(String[] args) {
        DBConnection.getConnection();
        Controller controller = new Controller();
        controller.run();
    }
}
