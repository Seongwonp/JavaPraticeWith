package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_11;

public class ContractEmployee extends FulltimeEmployee{
    private int  contractDuration;


    public ContractEmployee(String name, int employeeId, int contractDuration, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public int calculateSalary(){

        return contractDuration * super.getMonthlySalary();
    }
}
