class Bank{
    void getInterestRate(){
        System.out.println("7.0 Interest");
    }
}
class SBI extends Bank{
    @Override 
    void getInterestRate(){
        System.out.println("6.5% Interest");
    }
}
class HDFC extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("7.0% Interest");
    }
}
class ICIC extends Bank{
    @Override 
    void getInterestRate(){
        System.out.println("7.25% Interest");
    }
}
public class Main_59{
    public static void main(String[] args) {
        SBI S1=new SBI();
        S1.getInterestRate();
        
        HDFC H1=new HDFC();
        H1.getInterestRate();

        ICIC I1=new ICIC();
        I1.getInterestRate();
    }
}