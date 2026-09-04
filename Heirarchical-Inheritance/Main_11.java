class Device{
    String brand;
    String Model;
    double price;
    String Operating_system;

    void disp_device(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+Model);
        System.out.println("Price : "+price);
        System.out.println("Os : "+Operating_system);
    }

    void calc_discount(){
        if(price>=100000){
            System.out.println("15% Discount");
            double Discount_pice=price*0.15;
            System.out.println("Discount Price : "+Discount_pice);
            double Final_amt=price-Discount_pice;
            System.out.println("Final Price : "+Final_amt);
        }
        else if(price>=50000){
            System.out.println("10% Discount");
            double Discount_pice=price*0.10;
            System.out.println("Discount Price : "+Discount_pice);
            double Final_amt=price-Discount_pice;
            System.out.println("Final Price : "+Final_amt);
        }
        else{
            System.out.println("5% Discount");
            double Discount_pice=price*0.05;
            System.out.println("Discount Price : "+Discount_pice);
            double Final_amt=price-Discount_pice;
            System.out.println("Final Price : "+Final_amt);
        }
    }
}
class Mobile extends Device{
    int camera_MP=50;
    int RAM=8;
    double battery_capacity=5000;
    boolean has_5g=true;
    int num_sim=2;

    void mobile_details(){
        brand="Samsung";
        Model="A17";
        price=20000;
        Operating_system="Android";
    }
    void disp_mobile(){
        System.out.println("Camper Mp : "+camera_MP);
        System.out.println("RAM : "+RAM);
        System.out.println("Battery Capacity : "+battery_capacity);
        System.out.println("Has 5G? : "+has_5g);
        System.out.println("Number Of Sims : "+num_sim);
    }

    void check_battery_capacity(){
        if(battery_capacity>=5000){
            System.out.println("Long Battery BackUp");
        }
        else{
            System.out.println("Standard Battery BackUp");
        }
    }
}

class Laptop extends Device{
    int RAM=16;
    String Processor="Intel Core i5";
    String Storage="Solid State Drive";
    double screenSize=15.6;
    boolean hasDedicatedGPU=true;

    void laptop_details(){
        brand="DELL";
        Model="Dell Inspiron 15 3530";
        price=60000;
        Operating_system="Windows 11";
    }

    void disp_laptop(){
        System.out.println("RAm : "+RAM);
        System.out.println("Processor : "+Processor);
        System.out.println("Storage : "+Storage);
        System.out.println("Screen Size : "+screenSize);
        System.out.println("Has GPU? : "+hasDedicatedGPU);
    }

    void check_performances(){
        if(RAM>=16 && hasDedicatedGPU==true){
            System.out.println("Suitable for Gaming and High Performance");
        }
        else if(RAM>=8){
            System.out.println("Suitable for Normal Programming and Multitasking");
        }
        else{
            System.out.println("Suitable for Basic Usage");
        }

    }
}

public class Main_11{
    public static void main(String[] args) {
        System.out.println("---MOBILE DETAILS---");
        Mobile M1= new Mobile();
        M1.mobile_details();
        M1.disp_device();
        M1.calc_discount();
        M1.disp_mobile();
        M1.check_battery_capacity();
        System.out.println();


        System.out.println("---LAPTOP DETAILS---");
        Laptop L1=new Laptop();
        L1.laptop_details();
        L1.disp_device();
        L1.calc_discount();
        L1.disp_laptop();
        L1.check_performances();

    }
}