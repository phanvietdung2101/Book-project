
public class Main {
    public static void main(String[] args) {

        ProgrammingBook book1 = new ProgrammingBook("1","Thinking in Java",30,"Bruce Eckel","Java", "");
        ProgrammingBook book2 = new ProgrammingBook("3","Java: A beginner's Guide", 20,"Herbert Schildt", "Java", "");
        ProgrammingBook book3 = new ProgrammingBook("5","C, the compelete reference", 40,"Herbert Schildt", "C","");
        FictionBook book4 = new FictionBook("2","The Hand Maid's Tale",25, "Margaret Atwood","Giả tưởng suy đoán");
        FictionBook book5 = new FictionBook("4","Một thế giới dũng cảm", 35, "Aldous Huxley", "Khoa học viễn tưởng");
        FictionBook book6 = new FictionBook("6", "Kiêu hãnh và định kiến", 32, "Jane Austen","Tiểu thuyết lãng mạng");

        float totalPrice = 0;

        for (Book book : Book.bookList) {
            totalPrice += book.price;
        }
        System.out.println("Tong gia tien tat ca sach la: " + totalPrice);

        int countJavaBook = 0;

        for(int i = 0; i < Book.listIndex; i++){
            boolean isProgramBook = Book.bookList.get(i) instanceof ProgrammingBook;
            if(isProgramBook){
                boolean isJavaBook = ((ProgrammingBook) Book.bookList.get(i)).language.equals("Java");
                if(isJavaBook)
                    countJavaBook++;
            }
        }

        System.out.println("Tong so sach viet ve Java la " + countJavaBook);

    }
}
