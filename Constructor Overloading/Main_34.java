class Car{
    String brand;
    String model;
    double price;

    Car(){
        brand="Toyota";
        model="Fortuner";
        price=3500000;
    }

    Car(String brand){
        this.brand=brand;
        model="Creta";
        price=1800000;
    }

    Car(String brand,String model){
        this.brand=brand;
        this.model=model;
        price=1200000;
    }

    Car(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void disp_details(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        System.out.println("---------------");
    }
}

public class Main_34{
    public static void main(String[] args) {
        Car C1=new Car();
        C1.disp_details();

        Car C2=new Car("Hyundai");
        C2.disp_details();

        Car C3=new Car("Tata","Nexon");
        C3.disp_details();

        Car C4=new Car("BMW","X1",5200000);
        C4.disp_details();
    }
}