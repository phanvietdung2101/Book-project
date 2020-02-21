
public class Main {
    public static void main(String[] args) {

        ProgrammingBook book1 = new ProgrammingBook("PB0001","Thinking in Java",30,"Bruce Eckel","Java", "");
        ProgrammingBook book2 = new ProgrammingBook("PB0002","Java: A beginner's Guide", 20,"Herbert Schildt", "Java", "");
        ProgrammingBook book3 = new ProgrammingBook("PB0003","C, the compelete reference", 40,"Herbert Schildt", "C","");
        FictionBook book4 = new FictionBook("FB0001","The Hand Maid's Tale",25, "Margaret Atwood","Giả tưởng suy đoán");
        FictionBook book5 = new FictionBook("FB0002","Một thế giới dũng cảm", 35, "Aldous Huxley", "Khoa học viễn tưởng");
        FictionBook book6 = new FictionBook("FB0003", "Kiêu hãnh và định kiến", 32, "Jane Austen","Tiểu thuyết lãng mạng");

        BookManager list = new BookManager();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);

        float totalPrice = 0;



        for(int i = 0; i < 6; i++){
            totalPrice += list.bookList[i].price ;
        }

        System.out.println("Tong gia tien tat ca sach la: " + totalPrice);

        int countJavaBook = 0;

        for(int i = 0; i < 6; i++){
            boolean isProgramBook = list.bookList[i] instanceof ProgrammingBook;
            if(isProgramBook){
                boolean isJavaBook = ((ProgrammingBook) list.bookList[i]).language.equals("Java");
                if(isJavaBook)
                    countJavaBook++;
            }
        }

        System.out.println("Tong so sach viet ve Java la " + countJavaBook);

        System.out.println(Book.bookList[0].price);
    }
}
