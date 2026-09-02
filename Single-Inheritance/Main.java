class Student{
    String name;
    int rno;
    void dispstud(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rno);
    }
}
class Exam extends Student{
    double m1,m2,m3;
    double caltotal(){
        return m1+m2+m3;
    }
    void calavg(){
        double total=caltotal();
        double avg=total/3;

        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
    }
}

public class Main {
    public static void main(String[] args) {
        Exam e= new Exam();
        e.name="Saloni";
        e.rno=206;
        e.m1=90;
        e.m2=95;
        e.m3=100;
        e.dispstud();
        e.calavg();

    }
    
}
