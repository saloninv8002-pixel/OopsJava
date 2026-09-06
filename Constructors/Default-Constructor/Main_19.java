class Hotel_Booking{
    String Guest_Name;
    int Room_Number;
    int Days;

    void Disp_details(){
        System.out.println("Guest Name : "+Guest_Name);
        System.out.println("Room Number : "+Room_Number);
        System.out.println("Number Of Days : "+Days);
    }

}
public class Main_19{
    public static void main(String[] args) {
        Hotel_Booking H1=new Hotel_Booking();
        H1.Guest_Name="Saloni";
        H1.Room_Number=101;
        H1.Days=2;
        H1.Disp_details();
    }
}