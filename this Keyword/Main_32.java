class Laptop{
    String brand;
    String model;
    double price;

    void disp_laptop(Laptop l){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

    void show(){
        disp_laptop(this);
    }

}
public class Main_32{
    public static void main(String[] args) {
        Laptop L1=new Laptop();
        L1.brand="Dell";
        L1.model="Inspiron 15";
        L1.price=50000;

        L1.show();
    }
}