public class FullTimeEmp extends Employee{
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
    private double monthlySalary;

    public FullTimeEmp(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
}
