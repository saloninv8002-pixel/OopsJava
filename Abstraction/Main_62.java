abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class Main_62{
    public static void main (String args[]){
        Dog D1=new Dog();
        D1.sound();
        D1.eat();

        Cat C1=new Cat();
        C1.sound();
        C1.eat();
    }
}
