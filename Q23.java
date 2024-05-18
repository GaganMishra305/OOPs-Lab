public class Q23 {
    public static void main(String[] args) {
    Book book1 = new Book("Java Programming", "John Doe", 5);
    Book book2 = new Book("Python Programming", "Jane Smith", 2);
    Customer customer1 = new Customer(1, "Alice", "123 Maple Street");
    Customer customer2 = new Customer(2, "Bob", "456 Oak Street");
    book1.displayInfo();
    book2.displayInfo();
    System.out.println();
    customer1.buyBook(book1);
    customer2.buyBook(book2);
   
    System.out.println();
    book1.displayInfo();
    book2.displayInfo();
    }
   }


class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;
    public Book(String bookName, String bookAuthor, int bookCount) {
    this.bookName = bookName;
    this.bookAuthor = bookAuthor;
    this.bookCount = bookCount;
    }
    public String getBookName() {
    return bookName;
    }
    public String getBookAuthor() {
    return bookAuthor;
    }
    public int getBookCount() {
    return bookCount;
    }
    public void setBookCount(int bookCount) {
    this.bookCount = bookCount;
    }
    public void displayInfo() {
    System.out.println("Book Name: " + bookName + ", Author: " + bookAuthor +
   ", Count: " + bookCount);
    }
    public boolean buyBook() {
    if (bookCount > 0) {
    bookCount--;
    return true;
    } else {
    System.out.println("Sorry, the book is out of stock.");
    return false;
    }
    }
   }
   class Customer {
    // private int customerId;
    private String customerName;
    // private String customerAddress;
    public Customer(int customerId, String customerName, String customerAddress) {
    // this.customerId = customerId;
    this.customerName = customerName;
    // this.customerAddress = customerAddress;
    }
    public void buyBook(Book book) {
    System.out.println(customerName + " is buying the book: " +
   book.getBookName());
    if (book.buyBook()) {
    System.out.println("Remaining count of the book '" + book.getBookName() +
   "': " + book.getBookCount());
    }
    }
   }
   