public abstract class Employee {
    private String eName;
    private int eId;

    Employee(){

    }
    Employee(String eName, int eId){
        this.eName = eName;
        this.eId = eId;
    }

    //getter or setter method ka use ham isliye krte hain taki ham variable ko indirectly access kar sake
    //like agar eName ko access krna hoga apne ko to Employee.eName ka use karna padega that is not
    //efficient so usi ke liye apan getter and setter method ka use karte hain
    //and also we can say  for code security(bcause we cannot give directly access of variable)
    public String getEname(){
        return eName;
    }
    public int getEid(){
        return eId;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee[name = " + eName + ", id = " + eId + ", Salary = " + calculateSalary() +"]" + "\n";
    }
}
