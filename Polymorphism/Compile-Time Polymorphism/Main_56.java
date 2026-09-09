class Print{
    void print(String a){
        System.out.println("String : "+a);
    }
    void print(int a){
        System.out.println("Number : "+a);
    }
    void print(String a,int b){
        System.out.println("String : "+a+" Number : "+b);
    }
}
public class Main_56{
    public static void main(String args[]){
        Print P1=new Print();
        P1.print(12);
        P1.print("Saloni");
        P1.print("Tanav", 10);
    } 
}