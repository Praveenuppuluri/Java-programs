public class library {
    public static void main(String[] args) {
        book b1 = new book("Harry potter", "Jkrolings", 10.2, 333);
        book b2 = new book("One piece", "oda", 8.2, 433);
        book b3 = new book("Book of Fire", "abdul kalam", 12.2, 383);
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
        double totalPrice = b1.price+b2.price+b3.price;
        System.out.printf("Total price of books: $%.2f\n", totalPrice);
    }
}
class book{
    String title;
    String author;
    double price;
    int pages;
    book(String title,String author,double price,int pages){
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public double getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }
    public void displayInfo(){
        System.out.println("Title :"+ title);
        System.out.println("Author :"+ author);
        System.out.println("Price : "+"$"+ price);
        System.out.println("Pages : "+ pages);
        System.out.println( );

    }
}
