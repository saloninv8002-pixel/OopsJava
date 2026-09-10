abstract class Shape {
    abstract void Calculate_area();
}
class Circle extends Shape{
    double radius=12;
    void Calculate_area(){
        double area_circle=3.14*radius*radius;
        System.out.println("Area of Circle : "+area_circle);
    }
}
class Rectangle extends Shape{
    int l=12,b=3;
    void Calculate_area(){
        double area_rectangle=l*b;
        System.out.println("Area of Rectangle : "+area_rectangle);
    }
}
class Square extends Shape{
    int s=2;
    void Calculate_area(){
        double area_square=s*s;
        System.out.println("Area of Square : "+area_square);
    }
}

public class Main_65{
    public static void main(String args[]){
        Square S1=new Square();
        S1.Calculate_area();

        Rectangle R1=new Rectangle();
        R1.Calculate_area();

        Circle C1=new Circle();
        C1.Calculate_area();
    }
}