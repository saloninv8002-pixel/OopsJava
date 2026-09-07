class Vehicle{
    String Brand="Toyota";
    double price=1000000;
}
class Car extends Vehicle{
    String Brand="Honda";
    double price=1500000;

    void display(){
        System.out.println("Brand : "+super.Brand+", Price : "+super.price);
        System.out.println("Brand : "+Brand+", Price : "+price);
    }
}
public class Main_41{
    public static void main(String[] args) {
        Car C1=new Car();
        C1.display();
    }
}