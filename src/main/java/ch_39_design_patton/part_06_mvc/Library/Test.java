package ch_39_design_patton.part_06_mvc.Library;

import ch_39_design_patton.part_06_mvc.Library.controller.Controller;
import ch_39_design_patton.part_06_mvc.Library.util.DBConnection;

public class Test {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();

    }
}
