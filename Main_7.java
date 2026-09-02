class Product{
    String Product_name="Television";
    double price=12000;
    void disp_prod(){
        System.out.println("Product name : "+Product_name);
        System.out.println("Price : "+price);
    }
}
class electronics extends Product{
    int waranty=2;
}
class Mobile extends electronics{
    String brand="Samsung";
    void disp(){
        System.out.println("Brand : "+brand);
    }
}
public class Main_7{
    public static void main(String[] args) {
        Mobile M1= new Mobile();
        M1.disp_prod();
        M1.disp();
    }
}