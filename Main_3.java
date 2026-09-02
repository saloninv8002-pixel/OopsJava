class Account{
    String account_num="1243abc";
    String holder_name="Saloni";
    double balance=12345;
    void disp_account(){
        System.out.println("Account Number : "+account_num);
        System.out.println("Account Holder : "+holder_name);
        System.out.println("Balance : "+balance);
    }
}

class SavingsAccount extends Account{
    double interest_rate=7;
    void cal_interest(){
        double interest_amt=balance*interest_rate;
        System.out.println("Interest Rate : "+interest_rate);
        System.out.println("Interest Amount : "+interest_amt/100);
    }
}
public class Main_3{
    public static void main(String[] args) {
        SavingsAccount S1=new SavingsAccount();
        S1.disp_account();
        S1.cal_interest();
    }
}