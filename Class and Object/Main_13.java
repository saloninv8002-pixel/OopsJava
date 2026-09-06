class Car{
    String brand;
    String model;
    double price;

    void disp_car(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}
public class Main_13{
    public static void main(String[] args) {
        Car C1=new Car();
        C1.brand="Volkswagen";
        C1.model="Ameo";
        C1.price=1000000;
        C1.disp_car();

        Car C2=new Car();
        C2.brand="Toyota";
        C2.model="Fortuner";
        C2.price=3300000;
        C2.disp_car();

    }
}