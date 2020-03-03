import java.util.ArrayList;

public class Book {
    String bookCode;
    String name;
    float price;
    String author;
    static ArrayList<Book> bookList = new ArrayList<>() ;
    static int listIndex = 0;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String bookCode, String name, float price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        addBook(this);
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {
        return this.bookCode + "---" + this.name + "---" + this.author + "---" + this.price;
    }
}
