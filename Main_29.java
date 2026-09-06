class Rectangle{
    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void get_area(){
        double area=length*breadth;
        System.out.println("Area of Rectangle : "+area);
    }
}
public class Main_29{
    public static void main(String[] args) {
        Rectangle R1=new Rectangle(12, 3);
        R1.get_area();
    }
}