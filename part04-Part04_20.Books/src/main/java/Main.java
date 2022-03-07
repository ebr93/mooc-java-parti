import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String nameBook = scan.nextLine();

            if (nameBook.equals("")) {
                break;
            }

            System.out.println("Pages: ");
            int pagesBook = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year: ");
            int publicatioBook = Integer.valueOf(scan.nextLine());

            //adds the variables inputed and turns them into output for the class
            //ArrayList (books) is set up already, the class (Books) then adds the new variables--->outputs
            books.add(new Book(nameBook, pagesBook, publicatioBook));
        }

        System.out.println("What information will be printed? ");
        String detailsPrint = scan.nextLine();

        //to use (Book) modules we first need to name the class created, in this case (book) then we summon it by using (.) and name the module
        //example: (book.toString())  or (book.getName());
        if (detailsPrint.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }

        if (detailsPrint.equals("name")) {
            for (Book book1 : books) {
                System.out.println(book1.getName());
            }
        }

    }
}
