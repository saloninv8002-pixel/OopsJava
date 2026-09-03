class BankAccount{
    String Holder_Name="Saloni";
    String Account_Number="123abc";
    double balance=1000000;
    void displayAccount(){
        System.out.println("Holder Name : "+Holder_Name);
        System.out.println("Account Number : "+Account_Number);
        System.out.println("Balance : "+balance);
    }
}
class Savings_Account extends BankAccount{
    void calculate_interest(){
        double rate=7;
        double interest=rate*balance*1/100;
        System.out.println("Interest amount : "+interest);
    }
}
class Current_Account extends BankAccount{
    void check_overDraft(){
        double OverDraft_limit=5000;
        double withdrawal_amt=1234;
        if(withdrawal_amt<=balance){
            System.out.println("Withdrawal Is Allowed");
        }
        else if(withdrawal_amt-balance<=OverDraft_limit){
            System.out.println("Withdrawal Is Allowed using Overdraft");
        }
        else{
            System.out.println("Withdrawal Not Allowed");
        }
    }
}

public class Main_8{
    public static void main(String[] args) {
        Savings_Account S1=new Savings_Account();
        S1.displayAccount();
        S1.calculate_interest();

        Current_Account C1=new Current_Account();
        C1.displayAccount();
        C1.check_overDraft();
    }
}
