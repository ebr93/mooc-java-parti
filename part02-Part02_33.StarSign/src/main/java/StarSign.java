
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 2);
        System.out.println("\n---");
        printTriangle(8);
        System.out.println("\n---");
    }
    // For the Sysout for ("") I COULD HAVE JUST PLACED IT OUTSIDE THE WHILE, NO IF NECESSARY
    public static void printStars(int number) {
        int starCounter = 1;

        while (starCounter <= number) {
            System.out.print("*");
            starCounter++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int rowCounter = 1;

        while (rowCounter <= size) {
            printStars(size);
            rowCounter++;
        }
    }

    //MADE IT A LITTLE COMPLICATED FOR MYSELF ON THE RECTANGLE, NOT NECESSARY TO HAVE AN (IF) CONDITION
    public static void printRectangle(int width, int height) {
        int wDimension = 1;

        while (wDimension <= width) {
            printStars(width);
            wDimension++;
            if (width <= height) {
                printStars(width);
                wDimension++;
            }
            if (wDimension > height) {
                break;
            }
        }

    }

    public static void printTriangle(int size) {
        int rowPrint = 1;

        while (rowPrint <= size) {
            printStars(rowPrint);
            rowPrint++;
        }
    }
}
