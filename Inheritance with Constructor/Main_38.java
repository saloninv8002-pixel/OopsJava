class Person{
        String name;
        int age;
    Person(){
        name="Saloni";
        age=18;
    }
}
class Student extends Person{
    int rno;
    String Course;

    Student(){
        rno=123;
        Course="Java";
    }

    void disp_student(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll No : "+rno);
        System.out.println("Course : "+Course);
    }

}

public class Main_38{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.disp_student();
    }
}