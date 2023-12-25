import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeeList;
    //Arraylist isiye use krre hai kyonki hame isze ki chinta krne ki jarurat hi nai jaise array me hota tha
    //array jo hai fixed size ka hota hai jabki agar arraylist agar bharne wala rahega to apne size ko increase
    //kar leta hai

    PayRollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employeeList.add(e);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee e: employeeList){
            if(e.getEid()==id){
                employeeToRemove = e;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for(Employee e: employeeList){
            System.out.println(e);
        }
    }
}
