class Employee{
    void work(){
        System.out.println("Employee is Working");
    }
}
class Manager extends Employee{
    void work(){
        System.out.println("Manager is managing team");
        super.work();
    }
}
public class Main_42{
    public static void main(String[] args) {
        Manager M1=new Manager();
        M1.work();

    }
}