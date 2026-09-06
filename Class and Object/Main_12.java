class Student{
    String name;
    int rno;
    String phone_number;

    void disp_student(){
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+rno);
        System.out.println("Phone Number : "+phone_number);
    }
}
public class Main_12{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Saloni";
        S1.rno=123;
        S1.phone_number="7200673278";
        S1.disp_student();

        Student S2=new Student();
        S2.name="Natesh";
        S2.rno=456;
        S2.phone_number="9884773678";
        S2.disp_student();

        Student S3=new Student();
        S3.name="Vasu";
        S3.rno=678;
        S3.phone_number="9176738678";
        S3.disp_student();
    }
}
