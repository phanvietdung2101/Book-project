import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ProgrammingBook book1 = new ProgrammingBook("1","Thinking in Java",30,"Bruce Eckel","Java", "");
        ProgrammingBook book2 = new ProgrammingBook("3","Java: A beginner's Guide", 20,"Herbert Schildt", "Java", "");
        ProgrammingBook book3 = new ProgrammingBook("5","C, the compelete reference", 40,"Herbert Schildt", "C","");
        FictionBook book4 = new FictionBook("2","The Hand Maid's Tale",25, "Margaret Atwood","Giả tưởng suy đoán");
        FictionBook book5 = new FictionBook("4","Một thế giới dũng cảm", 35, "Aldous Huxley", "Khoa học viễn tưởng");
        FictionBook book6 = new FictionBook("6", "Kiêu hãnh và định kiến", 32, "Jane Austen","Tiểu thuyết lãng mạng");

        System.out.println("Book list");
        for (Book book : Book.bookList) {
            System.out.println(book.toString());
        }
        System.out.println("After sort by price");
        selectionSortByPrice(Book.bookList);
        for (Book book : Book.bookList) {
            System.out.println(book.toString());
        }
        System.out.println("After sort by name");
        insertionSortByName(Book.bookList);
        for (Book book : Book.bookList) {
            System.out.println(book.toString());
        }
        System.out.println("Price of The Hand Maid's Tale is " + getPriceWithBinarySearch("The Hand Maid's Tale",Book.bookList));
    }

    public static float getPriceByBookName(String name){
        for (Book book : Book.bookList) {
            if(book.name.equals(name)){
                return book.price;
            }
        }
        return -1;
    }

    public static void bubbleSortByPrice(ArrayList<Book> bookList){
        boolean swapped = true;
        for(int i = 0; i < bookList.size() && swapped;i++){
            swapped = false;
            for(int j = 0; j < (bookList.size() - i - 1); j++){
                if(bookList.get(j).price > bookList.get(j+1).price){
                    Book temp = bookList.get(j);
                    bookList.set(j,bookList.get(j+1));
                    bookList.set(j+1,temp);
                    swapped = true;
                }
            }
        }
    }

    public static void insertionSortByPrice(ArrayList<Book> bookList){
        for(int i = 1; i < bookList.size(); i++){
            Book book = bookList.get(i);
            float value = book.price;
            int j = i - 1;
            while(j >= 0 && (bookList.get(j).price > value)){
                bookList.set(j+1,bookList.get(j));
                j--;
            }
            bookList.set(j+1,book);
        }
    }

    public static void selectionSortByPrice(ArrayList<Book> bookList){
        for(int i = 0; i < bookList.size() - 1; i++){
            Book currentBook = bookList.get(i);
            float currentMinPrice = currentBook.price;
            int currentIndex = i;
            for(int j = i+1; j < bookList.size(); j++){
                if(bookList.get(j).price < currentMinPrice){
                    currentBook = bookList.get(j);
                    currentMinPrice = currentBook.price;
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                bookList.set(currentIndex,bookList.get(i));
                bookList.set(i,currentBook);
            }
        }
    }

    public static void insertionSortByName(ArrayList<Book> bookList){
        for(int i = 1; i < bookList.size(); i++){
            Book book = bookList.get(i);
            String name = book.name;
            int j = i - 1;
            while(j >= 0 && (bookList.get(j).name.compareTo(name) > 0)){
                bookList.set(j + 1,bookList.get(j));
                j--;
            }
            bookList.set(j+1,book);
        }
    }

    public static float getPriceWithBinarySearch(String inputName, ArrayList<Book> bookList){
        int low = 0;
        int high = bookList.size() - 1;
        while(high >= low){
            int mid = (high + low) / 2;
            if(bookList.get(mid).name.compareTo(inputName) > 0){
                high = mid - 1;
            } else if(bookList.get(mid).name.compareTo(inputName) < 0){
                low = mid + 1;
            } else
                return bookList.get(mid).price;
        }
        return -1;
    }
}
