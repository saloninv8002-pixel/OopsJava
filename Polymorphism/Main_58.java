class Car{
    void start(){
        System.out.println("Car starts with a key");
    }
}
class Bike extends Car{
    @Override
    void start(){
        System.out.println("Bike starts with a self-start");
    }
}
class Bus extends Bike{
    @Override
    void start(){
        System.out.println("Bus starts with an engine");
    }
}
public class Main_58{
    public static void main (String args[]){
        Bus B1=new Bus();
        B1.start();
    }
}