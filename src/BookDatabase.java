import java.util.HashMap;
import java.util.Scanner;

public class BookDatabase {
    HashMap<String, Book> bookDB = new HashMap<String, Book>();

    public Book searchBook(String sku) {
        return bookDB.get(sku);
    }

    public void addBook() {
        boolean found = false;
        String sku;
        String Title;
        String Author;
        String Description;
        double Price;
        Scanner in = new Scanner(System.in);
        System.out.println("**********Insert Book Details Please.***********");
        System.out.print("Enter SKU for the book: ");
        sku = in.nextLine();

        found = bookDB.containsKey(sku);
        if (!found) {
            System.out.print("Enter Title for the book: ");
            Title = in.nextLine();
            System.out.print("Enter Author for the book: ");
            Author = in.nextLine();
            System.out.print("Enter Description for the book: ");
            Description = in.nextLine();
            //in.nextLine();
            System.out.print("Enter price for the book: ");
            Price = in.nextDouble();
            Book newBook = new Book(sku, Title, Author, Description, Price);
            bookDB.put(sku, newBook);
        } else {
            System.out.println("Book Already Exists!");
            System.out.println();
        }
    }

    public void displayDataBase(){
        System.out.println("SKU " + "\t\t" + "Title" + "\t\t" + "Author" + "\t\t" + "Description" + "\t\t" + "Price");
        for (Book bookx : bookDB.values()){
            System.out.println(bookx.getSku() + "\t\t" + bookx.getTitle() + "\t\t" + bookx.getAuthor() +"\t\t" +
                    bookx.getDescription() + "\t\t$" + bookx.getPrice());
        }
    }

    public HashMap<String, Book> getBookDB() {
        return bookDB;
    }
}
