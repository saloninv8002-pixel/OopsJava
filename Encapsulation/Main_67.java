class Account{
    private double Balance;
    private double amount;

    public void setBalance(double Balance){
        this.Balance=Balance;
    }
    public double getBalance(){
        return Balance;
    }

    public void setwithdrawal(double amount){
        this.amount=amount;
    }
    public double getwithdrawal(){
        return amount;
    }

}
public class Main_67{
    public static void main(String args[]){
        Account A1=new Account();
        A1.setBalance(12000);
        System.out.println("Balance before Withdrawal : "+A1.getBalance());
        A1.setwithdrawal(9000);
        if (A1.getBalance()>=A1.getwithdrawal()){
            System.out.println("Balance After Withdrawal : "+(A1.getBalance()-A1.getwithdrawal()));
            }
        else{
                System.out.println("Insufficient Balance");
            }

        }
    }
