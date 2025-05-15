package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_03;

public class Manager extends Employee {
    final int SALARY = 2_000_000;
    @Override
    public int getSalary() {
        return super.getSalary()+SALARY;
    }
}
