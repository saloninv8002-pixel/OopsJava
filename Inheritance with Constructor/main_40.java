class company{
    String company_name;

    company(String company_name){
        this.company_name=company_name;
    }
}
class employee extends company{
    String employee_name;
    double salary;

    employee(){
        super("SCB");
        employee_name="Saloni";
        salary=1200000;
    }

    void disp_employee(){
        System.out.println("Company Name : "+company_name);
        System.out.println("Employee Name : "+employee_name);
        System.out.println("Salary : "+salary);
    }
}

public class Main_40{
    public static void main(String[] args) {
        employee e1=new employee();
        e1.disp_employee();
    }
} 