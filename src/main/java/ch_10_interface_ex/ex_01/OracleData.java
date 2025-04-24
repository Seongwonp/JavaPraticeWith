package ch_10_interface_ex.ex_01;

public class OracleData implements DataAccessObject{

    @Override
    public void insert() {
        System.out.println("Oracle Data inserted");
    }

    @Override
    public void select() {
        System.out.println("Oracle Data selected");
    }

    @Override
    public void update() {
        System.out.println("Oracle Data updated");
    }

    @Override
    public void delete() {
        System.out.println("Oracle Data deleted");
    }
}
