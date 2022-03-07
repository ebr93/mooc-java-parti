
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0 ; i < books.size(); i++) {
            // (i) works as an index number
            //books.get(i) calls the specific index it has
            //getID calls back the IDbook for specific index in ArrayList
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0; // the 0th index of the list (i.e, the first index of the list)
        int end = books.size() - 1; // the last index in the list

        //repeat until begin is larger than end:
        while (begin <= end) {
            int middle = (end + begin) / 2; //this is done to find half of index

            if (books.get(middle).getId() == searchedId) {  //the value at list[middle] is searched
                return middle;
            }
            if (books.get(middle).getId() < searchedId) {   //the value at list[middle] is smaller than searched
                begin = middle + 1;     //begin gains the value of (middle + 1)
                                        //begin is not 0 anymore, it is what midle + 1 is now. LEFT SIDE IS IGNORED
            }
            if (books.get(middle).getId() > searchedId) {   //the value at list[middle] is larger than searched
                end = middle - 1;       //end gains the value of (middle -1)
                                        //end is not the last number of index anymore, it is middle - 1 now. RIGHT SIDE IS IGNORED
            }
        }
        return -1;
    }
}

