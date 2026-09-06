class Pet{
    String name;
    String type;
    int age;

    Pet(){
        name="Bruno";
        type="Dog";
        age=3;
    }

    void disp_pet(){
        System.out.println("Name : "+name);
        System.out.println("Type : "+type);
        System.out.println("Age : "+age);
    }
}

public class Main_24{
    public static void main(String[] args) {
        Pet P1=new Pet();
        P1.disp_pet();
    }
}