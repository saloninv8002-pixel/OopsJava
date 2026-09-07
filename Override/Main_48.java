class Phone{
    void display_Features(){
        System.out.println("Calling, SMS, Contacts");
    }
}
class Smart_Phone extends Phone{
    @Override
    void display_Features(){
        System.out.println("Internet, Camera, GPS,Apps");
    }
}
public class Main_48{
    public static void main(String[] args) {
        Smart_Phone S1=new Smart_Phone();
        S1.display_Features();
    }
}