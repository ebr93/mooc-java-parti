
public class AdvancedAstrology {

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printSpaces(5);
        System.out.println("---");
        printStars(3);
        System.out.println("");
        printTriangle(3);
        System.out.println("---");
        christmasTree(40);
        System.out.println("---");

    }

    public static void printStars(int number) {
        int trackerStar = 1;

        while (trackerStar <= number) {
            System.out.print("*");
            trackerStar++;
        }
        System.out.println("");
    }


    public static void printSpaces(int number) {
        int trackerSpace = number;

        while (1 <= trackerSpace) {
            System.out.print(" ");
            trackerSpace--;
        }
    }

    public static void printTriangle(int size) {
        int triangleSpace = size - 1;
        int triangleStar = 1;

        while (size >= triangleStar) {
            printSpaces(triangleSpace);
            printStars(triangleStar);
            
            triangleSpace--;
            triangleStar++;
        }

    }

    public static void christmasTree(int height) {
        double heightAltered = height * 2;
        int trackerSpace = height - 1;
        int trackerStar = 1; 

        int spaceBase = height - 2;
        int spaceStar = 3;
        int spaceTracker = 1;
        

        while (trackerStar <= heightAltered) {

            printSpaces(trackerSpace);

            printStars(trackerStar);
            

            trackerSpace--;
            trackerStar+=2;
        }

        while (spaceTracker <= 2) {
            printSpaces(spaceBase);
            printStars(spaceStar);
            spaceTracker++;
        }

    }


}
