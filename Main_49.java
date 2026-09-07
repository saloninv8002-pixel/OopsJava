interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment through Google Pay / Phone Pay");
    }
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment through Credit Card");
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("Payment through Cash");
    }
}
public class Main_49{
    public static void main(String[] args) {
        UPI U1=new UPI();
        U1.pay();

        CreditCard C1=new CreditCard();
        C1.pay();

        Cash C2= new Cash();
        C2.pay();
    }
}