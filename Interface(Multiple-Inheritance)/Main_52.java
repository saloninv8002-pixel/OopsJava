interface Calculator{
    void addition(int a,int b);
    void subtraction(int a,int b); 
    void multiply(int a,int b);
    void divide(int a,int b);
}
class BasicCalculator implements Calculator{
    public void addition(int a,int b){
        int add=a+b;
        System.out.println("Addition : "+add);
    }
    public void subtraction(int a,int b){
        int sub=a-b;
        System.out.println("Subtraction : "+sub);
    }
    public void multiply(int a,int b){
        int mul=a*b;
        System.out.println("Multiplication : "+mul);
    }
    public void divide(int a,int b){
        int div=a/b;
        System.out.println("Division : "+div);
    }
}
public class Main_52{
    public static void main(String args[]){
        
        BasicCalculator B1=new BasicCalculator();

        B1.addition(12, 13);
        B1.subtraction(12, 13);
        B1.multiply(12, 3);
        B1.divide(12, 3);
    }
}