class Student_1{
    String name="Tanav";
    int rno=456;
    void disp_student(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rno);
    }
}
class Exam_1 extends Student_1{
    int m1=90,m2=95,m3=100;
    void disp_marks(){
        System.out.println("Marks : "+m1+" , "+m2+" , "+m3);
    }
}
class Result extends Exam_1{
    double total,avg;
    double calc_total(){
         return m1+m2+m3;
    }
    void calc_avg(){
        total=calc_total();
        avg=total/3;
    }
    void disp_result(){
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);

    }
}
public class Main_6{
    public static void main(String[] args) {
        Result R1=new Result();
        R1.disp_student();
        R1.disp_marks();
        R1.calc_avg();
        R1.disp_result();
    }
}