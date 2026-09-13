class Student{
    private String name;
    private int rno;
    private int marks;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setRollNo(int rno){
        this.rno=rno;
    }
    public int getRollNo(){
        return rno;
    }

    public void setmarks(int marks){
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
}
public class Main_66{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.setName("Saloni");
        System.out.println("Name : "+S1.getName());
        S1.setRollNo(101);
        System.out.println("Rol no : "+S1.getRollNo());
        S1.setmarks(95);
        System.out.println("Marks : "+S1.getmarks());
    }
}