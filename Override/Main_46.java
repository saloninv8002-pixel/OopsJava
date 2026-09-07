class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Dog{
    @Override 
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class Main_46{
    public static void main(String[] args) {
        Cat C1=new Cat();
        C1.sound();
    }
}