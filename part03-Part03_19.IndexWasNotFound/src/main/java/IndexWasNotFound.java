

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here

        int arrayTracker = 0;
        int index = 0;
        while (index < array.length) {
            if (array[index] == searching) {
                System.out.println(searching + " is at index " + index + ".");
                arrayTracker = searching;
            } 

            index++;

        }

        if (arrayTracker != searching) {
            System.out.println(searching + " was not found.");
        }

    }

}

/*
THIS IS THE SOLUTION OF MOOOC
1. THEY USED BOOLEAN VALUES TO DEDUCE
2. BOOLEAN (FOUND = FALSE;)
3. (FOUND) BECOMES TRUE IF (if (array[index] == searching)) CONDITION IS TRUE
4. OTHERWISE NEXT CONDITION COMES IN PLAY IF NOT FOUND AS IT IS FALSE

        int index = 0;
        boolean found = false;
        while (index < array.length) {
            if (array[index] == searching) {
                System.out.println(searching + " is at index " + index + ".");
                found = true;
            }
 
            index++;
        }
 
        if (!found) {
            System.out.println(searching + " was not found.");
        }

*/