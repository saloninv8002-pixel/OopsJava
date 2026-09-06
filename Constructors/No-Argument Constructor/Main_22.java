class Book{
    String Title;
    String Author;
    double price;

    Book(){
        Title="Harry Potter";
        Author="J.K Rowling";
        price=599;
    }

    void disp_book(){
        System.out.println("Book Title : "+Title);
        System.out.println("Author : "+Author);
        System.out.println("Price : "+price);
    }

}

public class Main_22{
    public static void main(String[] args) {
        Book B1=new Book();
        B1.disp_book();
    }
}