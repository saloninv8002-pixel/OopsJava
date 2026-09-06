class Food_Order{
    String Customer_Name;
    String Food_Item;
    int quantity;
    double price;

    Food_Order(){
        Customer_Name="Saloni";
        Food_Item="Pasta";
        quantity=1;
        price=320;
    }

    void disp_Food(){
        System.out.println("Customer Name : "+Customer_Name);
        System.out.println("Food Item : "+Food_Item);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+price);
    }
}

public class Main_23{
    public static void main(String args[]){
        Food_Order F1=new Food_Order();
        F1.disp_Food();
    }
}