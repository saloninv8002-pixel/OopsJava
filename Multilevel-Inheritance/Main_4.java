class Person{
    String name="Saloni";
    int age=18;
    void disp_person(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Employee_1 extends Person{
    int E_id=123;
    double salary=1000000;
    void disp_emp(){
        System.out.println("Employee Id : "+E_id);
        System.out.println("Salary : "+salary);
    }
}
class Manager extends Employee_1{
    int team_size=12;
    void calc_bonus(){
        System.out.println("Bonus : "+(salary/10));
    }
}
public class Main_4{
    public static void main(String[] args) {
        Manager M1= new Manager();
        M1.disp_person();
        M1.disp_emp();
        M1.calc_bonus();
    }
}
