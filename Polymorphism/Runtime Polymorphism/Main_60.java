class Delivery{
    void delivery(){
        System.out.println("Delivering the package");
    }
}
class BikeDelivery extends Delivery{
    @Override
    void delivery(){
        System.out.println("Delivering the package by Bike");
    }
}
class CarDelivery extends Delivery{
    @Override
    void delivery(){
        System.out.println("Delivering the package by Car");
    }
}
class DroneDelivery extends Delivery{
    @Override
    void delivery(){
        System.out.println("Delivering the package by Drone");
    }
}
public class Main_60{
    public static void main(String[] args) {
        BikeDelivery B1=new BikeDelivery();
        B1.delivery();
        
        CarDelivery C1=new CarDelivery();
        C1.delivery();

        DroneDelivery D1=new DroneDelivery();
        D1.delivery();
    }
}