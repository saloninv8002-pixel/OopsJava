class Sports_Player{
    String name;
    String Sports;
    double Score;

    Sports_Player(String n,String s,double m){
        name=n;
        Sports=s;
        Score=m;
    }

    void disp_details(){
        System.out.println("Player Name : "+name);
        System.out.println("Sports : "+Sports);
        System.out.println("Score : "+Score);
    }
}

public class Main_26{
    public static void main(String[] args) {
        Sports_Player S1=new Sports_Player("Sindhu", "Badminton", 10);
        S1.disp_details();

        Sports_Player S2=new Sports_Player("M.S Dhoni", "Cricket", 9);
        S2.disp_details();
    }
} 