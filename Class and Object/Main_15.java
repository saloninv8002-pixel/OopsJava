class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    double multiply(int a,int b){
        return a*b;
    }
    double division(int a,int b){
        return a/b;
    }
}
public class Main_15{
    public static void main(String[] args) {
        Calculator C1=new Calculator();
        double addition = C1.add(12, 3);
        System.out.println("Addition : "+addition);

        double subtraction=C1.sub(12, 5);
        System.out.println("Subtarction : "+subtraction);

        double Multiplication=C1.multiply(12, 3);
        System.out.println("Multiplication : "+Multiplication);

        double division=C1.division(12, 3);
        System.out.println("Division : "+division);
    }
}