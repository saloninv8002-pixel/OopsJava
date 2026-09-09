class Transport{
    void move(){
        System.out.println("Transport is Moving");
    }
}
class Road_Transport extends Transport{
    void drive(){
        System.out.println("Road vehicle is driving");
    }
}
class Water_Transport extends Transport{
    void sail(){
        System.out.println("Water vehicle is sailing");
    }
}
interface RoadVehicle{
    void drive();
}
interface WaterVehicle{
    void sail();
}
class AmphibiousVehicle extends Water_Transport implements RoadVehicle,WaterVehicle{
    public void drive(){
        System.out.println("AmphibiousVehicle Drives On road");
    }
    public void sail(){
        super.sail();
        System.out.println("AmphibiousVehicle Sails On Water");
    }
}

public class Main_53{
    public static void main(String[] args) {
        AmphibiousVehicle A1=new AmphibiousVehicle();
        A1.drive();
        A1.sail();
        A1.move();
    }
}
