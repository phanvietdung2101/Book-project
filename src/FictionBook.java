public class FictionBook extends Book{
    String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, float price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }
}
