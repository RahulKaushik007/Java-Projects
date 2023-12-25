public class Main {

    public static void main(String[] args) {
        FullTimeEmp emp1 = new FullTimeEmp("Rahul", 1, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Shekhar", 2, 40,100);

        PayRollSystem p1 = new PayRollSystem();

        p1.addEmployee(emp1);
        p1.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        p1.displayEmployee();
        System.out.println("Removing Shekhar");
        p1.removeEmployee(2);
        p1.displayEmployee();
    }
}
