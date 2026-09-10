abstract class Employee{
    abstract void Calculate_Salary();
}
class Manager extends Employee{
    double salary_manager=100000;
    double bonus_manager=50000;
    void Calculate_Salary(){
    System.out.println("Salary : "+salary_manager);
    System.out.println("Bonus : "+bonus_manager);
    System.out.println("Total Salary : "+(salary_manager+bonus_manager));
    }
}
class Developer extends Employee{
    double salary_developer=50000;
    double bonus_developer=10000;
     void Calculate_Salary(){
    System.out.println("Salary : "+salary_developer);
    System.out.println("Bonus : "+bonus_developer);
    System.out.println("Total Salary : "+(salary_developer+bonus_developer));
    }
}
public class Main_64{
    public static void main(String[] args) {
        Developer D1=new Developer();
        D1.Calculate_Salary();

        Manager M1=new Manager();
        M1.Calculate_Salary();
    }
}
