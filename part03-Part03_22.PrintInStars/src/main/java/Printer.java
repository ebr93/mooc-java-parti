
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        int print = 1;
        int index = 0;
        while (index < array.length) {
            System.out.print("*");
            print++;

            if (print > array[index]) {
                index++;
                print = 1;
                System.out.println(" ");
            }

        }
        // I made avariable for the index and one to track (print) stars
        // I made the condition to keep printing until the value of the stars was equal to 
        // the value in array(index). It started with the first number and then finally printed an extra lane and set
        // the (print) value that had increased back to 1. 
    }

}

/* MOOC ANSWER. They made an extra method specifically for printing. The method worked based with int (stars) by using array[index] as its value. 
Subtract -1 on each print until it was > 0. Then it would stop and keep going.
THE for-Each works because they are using a module inside of it. 

public class Printer {
 
    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
 
    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int stars : array) {
            printStars(stars);
            System.out.println();
        }
    }
 
    public static void printStars(int howMany) {
        while (howMany > 0) {
            System.out.print("*");
            howMany = howMany - 1;
        }
    }
}

*/