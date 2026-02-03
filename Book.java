public class Book {

    // Book attributes
    String title;
    String author;
    double price;
    String isbn;
    int stock;

    // Constructor
    Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    // Display book information
    void displayBookInfo() {
        System.out.println("----- Book Details -----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
        System.out.println("ISBN   : " + isbn);
        System.out.println("Stock  : " + stock);
        System.out.println();
    }

    // Apply discount
    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("Discount applied: " + percentage + "%");
        System.out.println("New price: $" + price);
        System.out.println();
    }

    // Add stock
    void addStock(int quantity) {
        stock += quantity;
        System.out.println(quantity + " new copies added.");
        System.out.println("Updated stock: " + stock);
        System.out.println();
    }

    // Check availability
    boolean isAvailable() {
        return stock > 0;
    }

    // MAIN METHOD (Java starts here)
    public static void main(String[] args) {

        // Create two books
        Book novel = new Book(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                15.99,
                "9780743273565",
                5
        );

        Book textbook = new Book(
                "Introduction to Algorithms",
                "Thomas H. Cormen",
                89.99,
                "9780262033848",
                2
        );

        // Show details
        novel.displayBookInfo();
        textbook.displayBookInfo();

        // Apply discount
        novel.applyDiscount(10);
        textbook.applyDiscount(15);

        // Add stock
        novel.addStock(3);
        textbook.addStock(5);

        // Check availability
        System.out.println("Is \"" + novel.title + "\" available? " + novel.isAvailable());
        System.out.println("Is \"" + textbook.title + "\" available? " + textbook.isAvailable());
    }
}
