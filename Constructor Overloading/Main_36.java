class Pizza{
    String size;
    String flavour;
    double price;

    Pizza(){
        size="Medium";
        flavour="Farmhouse";
        price=299;

    }
    Pizza(String size){
        this.size=size;
        flavour="Paneer Tikka";
        price=399;

    }

    Pizza(String size,String flavour){
        this.size=size;
        this.flavour=flavour;
        price=349;
    }
    Pizza(String size,String flavour,double price){
        this.size=size;
        this.flavour=flavour;
        this.price=price;
    }
    void display(){
        System.out.println("Size : "+size);
        System.out.println("Flavour : "+flavour);
        System.out.println("Price : "+price);
    }

}
public class Main_36{
    public static void main (String args[]){
        Pizza P1=new Pizza();
        P1.display();

        Pizza P2=new Pizza("Large");
        P2.display();

        Pizza P3=new Pizza("Medium","Cheese Burst");
        P3.display();

        Pizza P4=new Pizza("Large","Veggie Supreme",449);
        P4.display();

    }
}

