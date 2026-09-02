class vehicle{
    String brand="volkswagen";
    double speed=21.73;
    void disp_vehicle(){
        System.out.println("Brand : "+brand);
        System.out.println("Speed : "+speed);
    }
}
class car extends vehicle{
    String model="Ameo";
    String fuelType="Petrol";
    void disp_car(){
        System.out.println("Model  :"+model);
        System.out.println("Fuel Type : "+fuelType);
    }
}
public class Main_2{
    public static void main(String[] args) {
        car c1=new car();
        c1.disp_vehicle();
        c1.disp_car();
    }
}