class rectangle{
    void disp_area(int length,int breadth){
        double area=length*breadth;
        System.out.println("Area of Rectangle : "+area);
    }
    void disp_perimeter(int length,int breadth){
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter : "+perimeter);
    }
}
public class Main_14{
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.disp_area(12, 3);
        r1.disp_perimeter(12, 3);
    }
}