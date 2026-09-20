class Mobilephone{
    private String Brand;
    private String Model;
    private double price;

    public void setBrand(String Brand){
        this.Brand=Brand;
    }
    public String getBrand(){
        return Brand;
    }
    public void setmodel(String Model){
        this.Model=Model;
    }
    public String getmodel(){
        return Model;
    }
    public void setprice(double price){
        this.price=price;
    }
    public double getprice(){
        return price;
    }
}
public class Main_68{
    public static void main(String[] args) {
        Mobilephone M1=new Mobilephone();
        M1.setBrand("Samsung");
        M1.setmodel("A17");
        M1.setprice(12000);
        System.out.println("Brand : "+M1.getBrand());
        System.out.println("Model : "+M1.getmodel());
        System.out.println("Price : "+M1.getprice());
    }
}