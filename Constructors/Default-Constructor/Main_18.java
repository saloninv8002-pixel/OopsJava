class Flight{
    String Flight_Number;
    String Destination;
    int seats_available;

    void disp_flight(){
        System.out.println("Flight Number : "+Flight_Number);
        System.out.println("Destination : "+Destination);
        System.out.println("Seats Available : "+seats_available);
    }
}
public class Main_18{
    public static void main(String[] args) {
        Flight F1=new Flight();
        F1.Flight_Number="6E456";
        F1.Destination="Mumbai";
        F1.seats_available=120;
        F1.disp_flight();
    }
}
