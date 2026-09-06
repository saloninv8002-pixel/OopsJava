class Mobile {
    String brand;
    String model;
    double price;

    Mobile(){
        brand="Samsung";
        model="A17";
        price=20000;
    }

    void disp_mobile(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
    
}

public class Main_21{
    public static void main(String[] args) {
        Mobile M1=new Mobile();
        M1.disp_mobile();
    }
}
