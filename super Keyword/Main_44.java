class Dog{
    String name;
    void sound(){
        System.out.println("Dog Barks");
    }
    Dog(){
        name="Dog";
    }
}
class Cat extends Dog{
    String name;

    void sound(){
        System.out.println("Cat Meows");
        super.sound();
    }

    Cat(){
        super();
        name="Cat";
    }

    void display_name(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Main_44{
    public static void main(String[] args) {
        Cat C1=new Cat();
        C1.sound();
        C1.display_name();
    }
}