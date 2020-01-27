public class Employee{
    private String name;
    private double baseSalary;
    private int employeeID;
    private static int EmployeeCount;
    private Employee EmployeeManager;
    

    public Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary = baseSalary;
        this.EmployeeCount++;
        this.employeeID = this.EmployeeCount;
        this.EmployeeManager = this;

    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }
    public Employee getManager(){
        return this.EmployeeManager;
    }
    public boolean equals(Employee other){
        return this.employeeID == other.employeeID;
    }
    public String toString(){
        String stringEmployeeID = Integer.toString(employeeID);
        String nameAndID = stringEmployeeID + " "+ name;
        return nameAndID;

    }
    // public String employeeStatus(){

    // }
    public void printDetails(){
        System.out.println("Name " + name);
        System.out.println("Salary: " + baseSalary);
        System.out.println("ID: " + employeeID);
    }
}