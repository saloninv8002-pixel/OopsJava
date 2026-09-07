class Phone{
    String Brand;
    double price;

    Phone(String Brand,double price){
        this.Brand=Brand;
        this.price=price;
    }
}
class Smart_phone extends Phone{
    String model;

    Smart_phone(String model){
        super("Samsung",20000);
        this.model=model;
    }

    void display(){
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}

public class Main_43{
    public static void main(String[] args) {
        Smart_phone S1=new Smart_phone("Galaxy A17");
        S1.display();
    }
}
