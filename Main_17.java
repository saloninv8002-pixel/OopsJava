class Plant{
    String name;
    double height;
    int age;
}
public class Main_17{
    public static void main(String[] args) {
        Plant P1=new Plant();
        P1.name="Sunflower";
        P1.height=5;
        P1.age=1;
        System.out.println("Name : "+P1.name);
        System.out.println("Height : "+P1.height+" ft");
        System.out.println("Age : "+P1.age+" year");
    }
}