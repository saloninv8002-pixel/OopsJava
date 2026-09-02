class vehicle_1{
    String brand="Tesla";
    double speed=250;
    void disp_vehicle(){
        System.out.println("Brand : "+brand);
        System.out.println("Speed : "+speed);
    }
}
class car_1 extends vehicle_1{
    String model="Roadster";
    int Num_of_Doors=4;
    void disp_car(){
        System.out.println("Model : "+model);
        System.out.println("Number of Doors : "+Num_of_Doors);
    }
}
class Electric_car extends car_1{
    int battery_capacity=100;
    int charging_time=30;
    void disp_electric_car(){
        System.out.println("Battery Capacity : "+battery_capacity);
        System.out.println("Charging Time : "+charging_time);
    }
}

public class Main_5{
    public static void main(String[] args) {
        Electric_car E2=new Electric_car();
        E2.disp_car();
        E2.disp_vehicle();
        E2.disp_electric_car();
    }
}
