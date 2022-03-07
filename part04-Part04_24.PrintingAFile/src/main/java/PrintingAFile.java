
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        // try starts the process for the scanner to read a file, use Path.get to access and name file inside
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            //while loop to read the whole thing
            while (scanner.hasNextLine()) {
                //String and scanner to read each line ***COULD'VE USED THIS INSTEAD:
            //  System.out.println(fileReader.nextLine()); ***
                String row = scanner.nextLine();
                //Prints each line read THIS LINE WAS NOT NEEDED
                System.out.println(row);
            }

        //(catch) helps find potential errors and gives message
        } catch (Exception e) {
            System.out.println("Reading the file Failed.");
        }

    }
}
