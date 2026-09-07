class Phone{
    String brand;
    double price;
    Phone(String brand,double price){
        this.brand=brand;
        this.price=price;
    }
}
class Smart_Phone extends Phone{
    String model;

    Smart_Phone(){
        super("Samsung",20000);
        model="A17";
    }

    void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);
        System.out.println("Model : "+model);
    }

}

public class Main_39{
    public static void main(String[] args) {
        Smart_Phone S1=new Smart_Phone();
        S1.display();
    }
}