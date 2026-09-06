class Calculator{
    int add(int a,int b){
        return a+b;
    }

    void display(){
        System.out.println("Addition : "+this.add(10,20));
    }
}
public class Main_31{
    public static void main(String args[]){
        Calculator C1=new Calculator();
        C1.display();
    }
}