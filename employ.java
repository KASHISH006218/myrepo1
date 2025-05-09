
import java.lang.classfile.instruction.ThrowInstruction;
public class Main{
    public static void main(String[]args){
        Employee emp = new Employee();
        emp.setID(205);
        emp.setName("kunal");
        emp.setSalary(60000);
        emp.displayDetails();


    }

}





class Employee{
    private int id;
    private String name;
    private double salary;


    public int setID(int id){
        return id = id;
    }

        public int getID (){
            return id;

        }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
}
    public void setSalary(double salary){
        this.salary = salary;


    }
public double getsalary(){
    return salary;
}
public void displayDetails(){
    System.out.println("Employee ID: " +id);
    System.out.println("Name:" + name);
    System.out.println("Salary:" + salary);
}
}