import java.util.ArrayList;
import java.util.List;

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

// Define the LibraryStaff class
class LibraryStaff {
    // Some staff-specific methods can be added here
}

// Define the Library class
class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
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

    // Borrow and return book methods

    public void borrowBook(LibraryMember member, Book book) {
        // Implement borrowing logic
    }

    public void returnBook(LibraryMember member, Book book) {
        // Implement returning logic
    }

    // Report generation method

    public void generateReport() {
        // Implement report generation logic
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Example usage

        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 2);

        LibraryMember member1 = new LibraryMember("John Doe", 101);
        LibraryMember member2 = new LibraryMember("Jane Doe", 102);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        Book searchedBook = library.searchBook(1);
        System.out.println("Searched Book: " + searchedBook);

        LibraryMember searchedMember = library.searchMember(101);
        System.out.println("Searched Member: " + searchedMember);

        // Additional functionality can be added, such as borrowing and returning books
    }
}
