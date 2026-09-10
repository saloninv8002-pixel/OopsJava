abstract class Ticket{
    abstract void calculateprice();
}
class Movie_Ticket extends Ticket{
    void  calculateprice(){
        System.out.println("1 Ticket Price : 200Rs");
    }
}
class BusTicket extends Ticket{
    void  calculateprice(){
        System.out.println("Ticket Price for 1 km : 5Rs");
    }
}
class TrainTicket extends Ticket{
    void  calculateprice(){
        System.out.println("Ticket Price for 1 km : 2Rs");
    }
}
public class Main_63{
    public static void main(String[] args) {
        TrainTicket T1=new TrainTicket();
        T1.calculateprice();

        BusTicket B1=new BusTicket();
        B1.calculateprice();

        Movie_Ticket M1=new Movie_Ticket();
        M1.calculateprice();
    }
}

