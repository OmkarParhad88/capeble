import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Define the Book class
class Book {
  private String title;
  private String author;
  private int id;

  public Book(String title, String author, int id) {
    this.title = title;
    this.author = author;
    this.id = id;
  }

  // Getters and setters

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", id=" + id +
        '}';
  }
}

// Define the LibraryMember class
class LibraryMember {
  private String name;
  private int memberId;

  public LibraryMember(String name, int memberId) {
    this.name = name;
    this.memberId = memberId;
  }

  // Getters and setters

  public String getName() {
    return name;
  }

  public int getMemberId() {
    return memberId;
  }

  @Override
  public String toString() {
    return "LibraryMember{" +
        "name='" + name + '\'' +
        ", memberId=" + memberId +
        '}';
  }
}

class Library {
  private List<Book> books;
  private List<LibraryMember> members;
  private Lock borrowReturnLock;

  public Library() {
    this.books = new ArrayList<>();
    this.members = new ArrayList<>();
    this.borrowReturnLock = new ReentrantLock();
  }

  // Book-related methods

  public void addBook(Book book) {
    books.add(book);
  }

  public Book searchBook(int bookId) {
    for (Book book : books) {
      if (book.getId() == bookId) {
        return book;
      }
    }
    return null;
  }

  // Library member-related methods

  public void addMember(LibraryMember member) {
    members.add(member);
  }

  public LibraryMember searchMember(int memberId) {
    for (LibraryMember member : members) {
      if (member.getMemberId() == memberId) {
        return member;
      }
    }
    return null;
  }

  public void borrowBook(LibraryMember member, Book book) {
    borrowReturnLock.lock();
    try {
      if (books.contains(book)) {
        // Book is available
        // Implement borrowing logic
        System.out.println(member.getName() + " borrowed " + book.getTitle());
      } else {
        // Book is not available
        System.out.println("Book not available for borrowing.");
      }
    } finally {
      borrowReturnLock.unlock();
    }
  }

  public void returnBook(LibraryMember member, Book book) {
    borrowReturnLock.lock();
    try {
      // Implement returning logic
      System.out.println(member.getName() + " returned " + book.getTitle());
    } finally {
      borrowReturnLock.unlock();
    }
  }
}

public class LibraryManagementSystem {
  public static void main(String[] args) {

    Library library = new Library();

    Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1);
    Book book2 = new Book("he Psychology of Money", "Morgan Housel", 2);

    LibraryMember member1 = new LibraryMember("omkar", 201);
    LibraryMember member2 = new LibraryMember("vikas", 202);

    library.addBook(book1);
    library.addBook(book2);

    library.addMember(member1);
    library.addMember(member2);

    Book searchedBook = library.searchBook(1);
    System.out.println("Searched Book: " + searchedBook);

    LibraryMember searchedMember = library.searchMember(201);
    System.out.println("Searched Member: " + searchedMember);
    library.borrowBook(member1, book1);
    library.returnBook(member1, book1);
  }
}
