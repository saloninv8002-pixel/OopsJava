class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Main_54{
    public static void main (String args[]){
        Calculator C1=new Calculator();
        System.out.println(C1.add(80,24));
        System.out.println(C1.add(20.9, 45.8));
        System.out.println(C1.add(12, 34, 45));
    }
}
