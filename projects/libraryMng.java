import java.util.ArrayList;
import java.util.List;

// import java.util.Scanner;
class Book {
  private String title;
  private String author;
  private int price;

  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
}

class BookOpr {
  // public int quantity;
  List<Book> books = new ArrayList<Book>();

  public void adds(Book book) {
    // Book newbook = new Book(title, author, price);/
    this.books.add(book);
    // for (Book bo : books) {
    //   System.out.println(bo);
    // }
    // System.out.println(books);
    System.out.println(books.get(0).toString());
  }
}

public class libraryMng {
  public static void main(String[] args) {
    BookOpr bookOpr = new BookOpr();
    bookOpr.adds(new Book("omkar", "omkar", 34));
    bookOpr.adds(new Book("ramech", "omkar", 34));
    bookOpr.adds(new Book("jfgi", "omkar", 34));
    // System.out.println(bookOpr);
  }   

}
