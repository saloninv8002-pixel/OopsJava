class Shape{
    void draw(){
        System.out.println("Draw Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
}
public class Main_45{
    public static void main(String args[]){
        Circle C1=new Circle();
        C1.draw();
    }
}