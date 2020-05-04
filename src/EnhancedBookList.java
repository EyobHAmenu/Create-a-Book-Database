import java.util.Scanner;

public class EnhancedBookList {
    public static void main(String[] args) {


        String sku;
        Book testBook;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Sku: ");
        sku = in.nextLine();
        while(!(sku.equalsIgnoreCase("no"))) {

            BookDatabase db1 = new BookDatabase(sku);

            //printing the books stored in the database
            System.out.println("**********Books in the database.***********");
            testBook = db1.searchBook(sku);
            System.out.println(testBook.toString());

            System.out.print("Enter Sku/(no to stop): ");
            sku = in.nextLine();
        }
    }
}
