class Movie{
    String Movie_Name;
    String seat_number;
    double price;

    Movie(){
        Movie_Name="Leo";
        seat_number="A10";
        price=250;
    }

    Movie(String Movie_Name){
        this.Movie_Name=Movie_Name;
        seat_number="B15";
        price=300;
    }

    Movie(String Movie_Name,String seat_number){
        this.Movie_Name=Movie_Name;
        this.seat_number=seat_number;
        price=280;
    }

    Movie(String Movie_Name,String seat_number,double price){
        this.Movie_Name=Movie_Name;
        this.seat_number=seat_number;
        this.price=price;

    }

    void Display(){
        System.out.println("Movie Name : "+Movie_Name);
        System.out.println("Seat Number : "+seat_number);
        System.out.println("Price : "+price);
    }
}

public class Main_35{
    public static void main(String[] args) {
        Movie M1=new Movie();
        M1.Display();
        
        Movie M2=new Movie("Jailer");
        M2.Display();

        Movie M3=new Movie("Vikram","C08");
        M3.Display();

        Movie M4=new Movie("Master","D12",200);
        M4.Display();

    }
}