package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_01;

public class MySqlData implements DataAccessObject {

    @Override
    public void insert() {
        System.out.println("MySqlData inserted");
    }

    @Override
    public void select() {
        System.out.println("MySqlData selected");
    }

    @Override
    public void update() {
        System.out.println("MySqlData updated");
    }

    @Override
    public void delete() {
        System.out.println("MySqlData deleted");
    }
}
