class Island{
    String name;
    String country;
    double area;

    Island(String n,String c,double a){
        name=n;
        country=c;
        area=a;
    }

    void disp_island(){
        System.out.println("Island Name : "+name);
        System.out.println("Country : "+country);
        System.out.println("Area : "+area+" Km^2");
    }
}

public class Main_27{
    public static void main(String[] args) {
        Island I1=new Island("Hawaii", "USA", 28311);
        I1.disp_island();

        Island I2=new Island("Bali", "Indonesia", 5780);
        I2.disp_island();
    }
}