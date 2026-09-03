class person{
    String name="Saloni";
    int age=18;
    String phone_num="7200673456";
    String email_id="saloni.nv@gmail.com";
    void Display_person(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+phone_num);
        System.out.println("Email Id : "+email_id);
    }
}
class Student extends person{
    int rno=123;
    String department="CSC";
    int m1=100,m2=90,m3=95,m4=88,m5=91;
    void display_marks(){
        System.out.println("Marks : "+m1+" , "+m2+" , "+m3+" , "+m4+" , "+m5);
    }
    double Calculate_total(){
        return m1+m2+m3+m4+m5;
    }
    double Calculate_avg(){
        double Total=Calculate_total();
        double avg=Total/5;
        return avg;
    }
    void disp_stud(){
        System.out.println("Total : "+Calculate_total());
        System.out.println("Average : "+Calculate_avg());
    }
    void Check_pass_fail(){
        if(Calculate_avg()>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

}
class Teacher extends person{
    int E_id=345;
    String subject="Mathematics";
    double experience=12.5;
    double salary=1200000;
    
    void Display_Teacher(){
        System.out.println("ID : "+E_id);
        System.out.println("Subject : "+subject);
        System.out.println("Years Of Experience : "+experience);
        System.out.println("Salary : "+salary);
    }
    void Disp_bonus(){
        if(experience>=10){
            System.out.println("20% bonus");
            double Bonus=salary*0.2;
            System.out.println("Bonus Amount : "+Bonus);
            double Amount=salary+Bonus;
            System.out.println("Final Salary : "+Amount);
        }
        else if(experience>=5){
            System.out.println("10% bonus");
            double Bonus=salary*0.1;
            System.out.println("Bonus Amount : "+Bonus);
            double Amount=salary+Bonus;
            System.out.println("Final Salary : "+Amount);
        }
        else{
            System.out.println("5% bonus");
            double Bonus=salary*0.05;
            System.out.println("Bonus Amount : "+Bonus);
            double Amount=salary+Bonus;
            System.out.println("Final Salary : "+Amount);
        }
    }
}

public class Main_9{
    public static void main(String args[]){
        System.out.println("---STUDENT DETAILS---");
        Student S=new Student();
        S.display_marks();
        S.Display_person();
        S.Calculate_total();
        S.Calculate_avg();
        S.disp_stud();
        S.Check_pass_fail();
        System.out.println();

        System.out.println("---TEACHER DETAILS---");
        Teacher T=new Teacher();
        T.Display_person();
        T.Display_Teacher();
        T.Disp_bonus();
    }
}
