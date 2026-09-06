class Mobile{
    String brand;
    String model;
    double price;

    Mobile(){
        this("Samsung","A17",20000);
    }

    Mobile(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void disp_mobile(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}
public class Main_30{
    public static void main(String[] args) {
        Mobile M1=new Mobile();
        M1.disp_mobile();
    }
}