
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();

        //try & Scanner to allow reader to find and read file. Path helps us find the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            //while loop allows file to be readed line by line and printed
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

        // catch helps avoid errors and closes process
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

    }
}
