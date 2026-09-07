class Bank{
    double interestRate(){
        return 6.5;
    }
}
class SBI extends Bank{
    @Override
    double interestRate(){
        return 7.0;
    }
}
class HDFC extends Bank{
    @Override
    double interestRate(){
        return 7.2;
    }
}
public class Main_47{
    public static void main(String[] args) {
        HDFC H1=new HDFC();
        System.out.println(H1.interestRate());
    }
}