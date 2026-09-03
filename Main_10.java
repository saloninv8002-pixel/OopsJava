class Vehicle{
    String brand;
    String model;
    double speed;
    double price=1000000;
    String fuel_type="Disel";
    
    void disp_vehicle(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Speed : "+speed);
        System.out.println("Price : "+price);
        System.out.println("Fuel Type : "+fuel_type);
    }
    
    void calc_milage(){
        if(fuel_type.toLowerCase().equals("petrol")){
            System.out.println("Milage : 15 km/charge");
        }
        else if(fuel_type.toLowerCase().equals("diesel")){
            System.out.println("Milage : 20 km/charge");
        }
        else if(fuel_type.toLowerCase().equals("electric")){
            System.out.println("Milage : 100 km/charge");
        }
        else{
            System.out.println("Wrong Input"); 
        }
    }
}

class Car extends Vehicle{
    int num_doors=4;
    int num_seats=5;
    String Transmission_type="Automatic";
    boolean has_sunroof=false;

    Car(){
    brand="Volkswagen";
    model="Ameo";
    speed=21.7;
    }

    void calc_insurance(){
        System.out.println("---INSURANCE TYPE---");
        if(price>=2000000){
            System.out.println("8% Insurance");
            double insurance_amt=price*0.08;
            System.out.println("Insurance Amount : "+insurance_amt);
        }
        else if(price>=1000000){
            System.out.println("6% Insurance");
            double insurance_amt=price*0.06;
            System.out.println("Insurance Amount : "+insurance_amt);
        }
        else{
            System.out.println("4% Insurance");
            double insurance_amt=price*0.04;
            System.out.println("Insurance Amount : "+insurance_amt);
        }
    }
    void display_car(){
        System.out.println("Number Of Doors : "+num_doors);
        System.out.println("Number of Seats : "+num_seats);
        System.out.println("Transmission Type : "+Transmission_type);
        System.out.println("Sun Roof ? : "+has_sunroof);
    }
}
class Bike extends Vehicle{
    int engine_CC=250;
    int gears=0;
    boolean Anti_lock_Braking=true;

    Bike(){
     brand="Yamaha";
     model="R15";
     speed=150;
    }

    void calc_roadtax(){
        if(engine_CC>=500){
            System.out.println("Road Tax : 10000");
        }
        else if(engine_CC>=250){
            System.out.println("Road Tax : 6000");
        }
        else{
            System.out.println("3000");
        }
    }

    void disp_bike(){
        System.out.println("Engine : "+engine_CC);
        System.out.println("Anti Lock Bracking System ? : "+Anti_lock_Braking);
    }
}
public class Main_10{
    public static void main(String[] args) {
        System.out.println("---CAR DETAILS---");
        Car c=new Car();
        c.disp_vehicle();
        c.calc_milage();
        c.calc_insurance();
        c.display_car();

        System.out.println("---BIKE DETAILS---");
        Bike b=new Bike();
        b.disp_vehicle();
        b.calc_milage();
        b.calc_roadtax();
        b.disp_bike();
    }
}