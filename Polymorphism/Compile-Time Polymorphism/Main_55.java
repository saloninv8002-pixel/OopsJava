class Shape{
    void area(double radius){
        double area_circle=3.14*radius*radius;
        System.out.println("Area of Circle : "+area_circle);
    }
    void area(int l,int b){
        int area_rectangle=l*b;
        System.out.println("Area of Rectangle : "+area_rectangle);
    }
    void area(int s){
        int area_square=s*s;
        System.out.println("Area of Square : "+area_square);
    }
}
public class Main_55{
    public static void main (String args[]){
        Shape s1=new Shape();
        s1.area(12);
        s1.area(12.5);
        s1.area(12, 3);

    } 
}