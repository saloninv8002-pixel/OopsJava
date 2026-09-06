class Historical_Monument{
    String name;
    String city;
    int year_Bulit;

    Historical_Monument(String n,String c,int Y){
        name=n;
        city=c;
        year_Bulit=Y;
    }

    void disp_monuments(){
        System.out.println("Monument Name : "+name);
        System.out.println("City : "+city);
        System.out.println("Year Built : "+year_Bulit);
    }
}

public class Main_28{
    public static void main (String args[]){
        Historical_Monument H1= new Historical_Monument("Taj Mahal", "Agra", 1653);
        H1.disp_monuments();

        Historical_Monument H2=new Historical_Monument("Red Fort", "Delhi", 1639);
        H2.disp_monuments();
    }
}