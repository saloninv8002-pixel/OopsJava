class Vehicle{
    String Brand;
    double price;

    Vehicle(){
        Brand="volkswagen";
        price=1000000;
    }
}
class car extends Vehicle{
    String model;

    car(){
        model="Ameo";
    }

    void display_car(){
        System.out.println("Brand : "+Brand);
        System.out.println("Price : "+price);
        System.out.println("Model : "+model);
    }
}

public class Main_37{
    public static void main(String[] args) {
        car C1=new car();
        C1.display_car();
    }
}
