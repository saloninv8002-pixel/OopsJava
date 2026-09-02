class Employee{
    String name;
    int eid;
    String dept;
    void dispemp(){
        System.out.println("Name : "+name);
        System.out.println("Employee ID : "+eid);
        System.out.println("Department : "+dept);
    }
}
class Salary extends Employee{
    double basic_salary=100000;
    double bonus;
    void calsalary(){
        System.out.println("Initial Salary : "+basic_salary);
        System.out.println("Bonus : "+bonus);
        double total_salary=basic_salary+bonus;
        System.out.println("Final Salary : "+total_salary);
    }

}

public class Main_1{
    public static void main (String args[]){
        Salary S1=new Salary();
        S1.name="Saloni";
        S1.eid=987;
        S1.dept="CSC";
        S1.bonus=12000;
        S1.dispemp();
        S1.calsalary();
    }
}
