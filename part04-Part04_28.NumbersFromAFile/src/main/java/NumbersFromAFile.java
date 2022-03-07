
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());


        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());

                if (lowerBound <= number && upperBound >= number) {
                    list.add(number);
                }
            }
        } catch (Exception e) {
            System.out.println("File Problem.");
        }

        System.out.println("Numbers: " + list.size());
    }

}
