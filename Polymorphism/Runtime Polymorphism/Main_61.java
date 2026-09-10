class Course{
    void getCourseDetails(){
        System.out.println("---Course details---");
    }
}
class ProgrammingCourse extends Course{
    @Override
    void getCourseDetails(){
        System.out.println("Java, Python, Web Development");
    }
}
class MathCourse extends Course{
    @Override
    void getCourseDetails(){
        
        System.out.println("Algebra, Calculus, Statistics");
    }
}
class ScienceCourse extends Course{
    @Override
    void getCourseDetails(){
        System.out.println("Physics, Chemistry, Biology");
    }
}
public class Main_61{
    public static void main (String args[]){
        ProgrammingCourse P1=new ProgrammingCourse();
        P1.getCourseDetails();
        
        MathCourse M1=new MathCourse();
        M1.getCourseDetails();

        ScienceCourse S1=new ScienceCourse();
        S1.getCourseDetails();
    }
}