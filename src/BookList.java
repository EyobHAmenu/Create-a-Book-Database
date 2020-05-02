import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        /*
            case:
            How many books would you like to check in:
            2
            **********Insert Book Details Please.***********
            Enter SKU for the book: Java123
            Enter Title for the book: Java
            Enter Author for the book: Eyob
            Enter Description for the book: Intro for Java
            Enter price for the book: 47.50
            **********Insert Book Details Please.***********
            Enter SKU for the book: Java431
            Enter Title for the book: Advanced Java
            Enter Author for the book: Amenu
            Enter Description for the book: Algorithm in Java
            Enter price for the book: 230
            SKU 		Title		Author		Description		Price
            Java123		Java		Eyob		Intro for Java		$47.5
            Java431		Advanced Java		Amenu		Algorithm in Java		$230.0
            **********Books in the database.***********
            Java123	Java	Eyob	Intro for Java	47.5
            Java431	Advanced Java	Amenu	Algorithm in Java	230.0

         */
        Scanner in = new Scanner(System.in);
        int numberOfBooks;
        Book testBook;
        BookDatabase db1 = new BookDatabase();
        System.out.println("How many books would you like to check in: ");
        numberOfBooks = in.nextInt();

        for(int i = 0; i < numberOfBooks; i++){
            db1.addBook();
        }
        db1.displayDataBase();

        //printing the books stored in the database
        System.out.println("**********Books in the database.***********");
        for(String x : db1.getBookDB().keySet()) {
            testBook = db1.searchBook(x);
            System.out.println(testBook.toString());
        }
    }
}
