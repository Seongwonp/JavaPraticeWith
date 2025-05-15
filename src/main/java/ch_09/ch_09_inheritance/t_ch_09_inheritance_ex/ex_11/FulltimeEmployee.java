package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_11;

public class FulltimeEmployee extends Employee {
    private int monthlySalary;

    public FulltimeEmployee(String name, int employeeId, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary*12;
    }
}
