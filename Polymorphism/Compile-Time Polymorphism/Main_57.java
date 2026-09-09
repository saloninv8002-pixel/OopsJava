class Payment{
    void pay(double amount){
        System.out.println("Payment successful via Cash!");
    }
    void pay(double amount, String Card_type){
        System.out.println("Payment successful via Card!");
    }
    void pay(double amount,String Card_type,int otp){
        System.out.println("Card Payment Successful with OTP Verification!");
    }
}
public class Main_57{
    public static void main (String args[]){
        Payment P1=new Payment();
        P1.pay(10000);
        P1.pay(12000, "Credit Card");
        P1.pay(3500, "Debit Card", 1234);

    }
}