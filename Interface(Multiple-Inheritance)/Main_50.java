interface Shape{
    void area();
}
class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        double area=3.14*radius*radius;
        System.out.println("Ärea of Circle : "+area);
    }
}
class Rectangle implements Shape{
    int length,breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        double area=length*breadth;
        System.out.println("Area of Rectangle : "+area);
    }
}
class Triangle implements Shape{
    int base,height;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        double area=0.5*base*height;
        System.out.println("Area of Triangle : "+area);
    }
}
public class Main_50{
    public static void main(String[] args) {
        Circle C1=new Circle(12);
        C1.area();

        Rectangle R1=new Rectangle(12,3);
        R1.area();

        Triangle T1=new Triangle(4,5);
        T1.area();
    }
}