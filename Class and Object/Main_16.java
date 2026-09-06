class Bank_Account{
    String Account_Holder;
    String Account_Number;
    double balance;

    void disp_accountdetail(){
        System.out.println("---ACCOUNT DETAILS---");
        System.out.println("Account Holder : "+Account_Holder);
        System.out.println("Account Number : "+Account_Number);
        System.out.println("Balance : "+balance);
    }

    void deposit(double amount){
        System.out.println("---DEPOSIT---");
        System.out.println("Deposited Amout : "+amount);
        System.out.println("Total Amount : "+(balance+amount));
        balance=balance+amount;

    }
    void withdraw(double amount){
        System.out.println("---WITHDRAW---");
        System.out.println("Amount To be withDrawn : "+amount);
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Balance Amount : "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    void display_balance(){
        System.out.println("---BALANCE---");
        System.out.println("Balance amount : "+balance);
    }
}
public class Main_16{
    public static void main(String args[]){
        Bank_Account B1=new Bank_Account();
        B1.Account_Holder="Saloni";
        B1.Account_Number="123abc";
        B1.balance=10000;

        B1.disp_accountdetail();
        B1.deposit(5000);
        B1.withdraw(20000);
        B1.display_balance();
    }
}