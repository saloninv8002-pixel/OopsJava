class Book{
    String Title;
    double price;

    Book(){
        Title="Harry Potter";
        price=599;
    }

    Book(String Title){
        this.Title=Title;
        price=499;
    }

    Book(String Title,double price){
        this.Title=Title;
        this.price=price;
    }
    void display(){
        System.out.println("Book Title : "+Title);
        System.out.println("Price : "+price);
    }
}

public class Main_33{
    public static void main(String[] args) {
        Book B1=new Book();
        B1.display();

        Book B2=new Book("3 Idiots");
        B2.display();

        Book B3=new Book("Lost In The Never Woods",379);
        B3.display();

    }
}