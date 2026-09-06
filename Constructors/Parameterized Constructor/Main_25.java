class Song{
    String Title;
    String Artist;
    double Duration;

    Song(String T,String A,double D){
        Title=T;
        Artist=A;
        Duration=D;
    }

    void disp_song_details(){
        System.out.println("Song Title : "+Title);
        System.out.println("Artist Name : "+Artist);
        System.out.println("Song Duration : "+Duration);

    }
}

public class Main_25{
    public static void main(String[] args) {
        Song S1=new Song("Mudhal Nee","Sid Sriram",5);
        S1.disp_song_details();

        System.out.println("------------------------------------");

        Song S2=new Song("Pavazha Malli","Sai Abhyankkar",5.09);
        S2.disp_song_details();

    }
}
