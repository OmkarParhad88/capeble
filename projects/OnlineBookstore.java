import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

class User {
    private String userId;
    private String username;
    private String password;

    public User(String username, String password) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
    }

    // Getters and setters...
}

class Book {
    private String title;
    private String author;
    private double price;
    private int availability;

    public Book(String title, String author, double price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Getters and setters...

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Availability: " + availability);
    }
}

class ShoppingCart {
    private List<String> bookTitles;
    private List<Integer> quantities;

    public ShoppingCart() {
        this.bookTitles = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addItemToCart(String bookTitle, int quantity) {
        bookTitles.add(bookTitle);
        quantities.add(quantity);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("Book: " + bookTitles.get(i) + ", Quantity: " + quantities.get(i));
        }
    }
}

class Bookstore {
    private List<Book> catalog;
    private List<Integer> inventory;
    private ReentrantLock catalogLock = new ReentrantLock();
    private ReentrantLock inventoryLock = new ReentrantLock();

    public Bookstore() {
        this.catalog = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void addBookToCatalog(Book book, int quantity) {
        catalogLock.lock();
        try {
            catalog.add(book);
            inventory.add(quantity);
        } finally {
            catalogLock.unlock();
        }
    }

    public Book getBookFromCatalog(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayCatalog() {
        catalogLock.lock();
        try {
            System.out.println("Book Catalog:");
            for (Book book : catalog) {
                book.displayBookInfo();
            }
        } finally {
            catalogLock.unlock();
        }
    }

    public boolean processOrder(User user, ShoppingCart cart) {
        inventoryLock.lock();
        try {
            for (int i = 0; i < cart.getBookTitles().size(); i++) {
                String bookTitle = cart.getBookTitles().get(i);
                int requestedQuantity = cart.getQuantities().get(i);

                for (int j = 0; j < catalog.size(); j++) {
                    Book book = catalog.get(j);
                    if (book.getTitle().equals(bookTitle)) {
                        int availableQuantity = inventory.get(j);

                        if (availableQuantity < requestedQuantity) {
                            System.out.println("Sorry, " + bookTitle + " is out of stock.");
                            return false;
                        }

                        inventory.set(j, availableQuantity - requestedQuantity);
                        break;
                    }
                }
            }
        } finally {
            inventoryLock.unlock();
        }

        generateInvoice(user, cart);

        System.out.println("Order processed successfully. Invoice generated.");
        return true;
    }

    private void generateInvoice(User user, ShoppingCart cart) {
        System.out.println("Invoice generated for user: " + user.getUsername());
        cart.displayCart();
    }
}

public class OnlineBookstore {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, 10);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50, 15);

        bookstore.addBookToCatalog(book1, 10);
        bookstore.addBookToCatalog(book2, 15);

        bookstore.displayCatalog();

        User user = new User("john_doe", "password123");
        ShoppingCart cart = new ShoppingCart();
        cart.addItemToCart(book1.getTitle(), 2);
        cart.addItemToCart(book2.getTitle(), 1);

        if (bookstore.processOrder(user, cart)) {
            // Handle successful order
        } else {
            // Handle failed order
        }
    }
}
