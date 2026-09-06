class Movie_Ticket{
    String Movie_Name;
    int seat_Number;
    double Ticket_price;

    void disp_details(){
        System.out.println("Movie Name : "+Movie_Name);
        System.out.println("Seat Number : "+seat_Number);
        System.out.println("Ticket Price : "+Ticket_price);
    }
}

public class Main_20{
    public static void main(String[] args) {
        Movie_Ticket M1=new Movie_Ticket();
        M1.Movie_Name="Spider Man";
        M1.seat_Number=12;
        M1.Ticket_price=199;
        M1.disp_details();
    }
}