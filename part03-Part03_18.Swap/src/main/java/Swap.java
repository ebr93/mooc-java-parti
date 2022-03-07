
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("Give two indices to swap: ");
        int arrayChange1 = Integer.valueOf(scanner.nextLine()); 
        int arrayChange2 = Integer.valueOf(scanner.nextLine()); 

        int helper = array[arrayChange1];
        array[arrayChange1] = array[arrayChange2];
        array[arrayChange2] = helper;
        
        // Created 2 variables to represent the index in the array to be changed
        // Made (helper) to assist with the exchange of values
        // since arrays can give or take new values then I made them swap between the wanted arrays to be exchanged.

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
