interface Notification{
    void sendNotification();
}
class Email implements Notification{
    public void sendNotification(){
        System.out.println("Notification sent through Email");
    }
}
class SMS implements Notification{
    public void sendNotification(){
        System.out.println("Notification sent through SMS");
    }
}
class PushNotification implements Notification{
    public void sendNotification(){
        System.out.println("Notification sent through Mobile App");
    }
}
public class Main_51{
    public static void main(String args[]){
        Email E1=new Email();
        E1.sendNotification();

        SMS S1=new SMS();
        S1.sendNotification();

        PushNotification P1=new PushNotification();
        P1.sendNotification();
    }
}