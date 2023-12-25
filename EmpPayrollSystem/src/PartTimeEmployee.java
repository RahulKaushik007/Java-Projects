public class PartTimeEmployee extends Employee{

    public int hoursWorked;
    public double hourlyRate;
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name,id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }
}
