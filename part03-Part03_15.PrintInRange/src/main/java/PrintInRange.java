
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(9);
        listNumber.add(5);
        listNumber.add(3);
        listNumber.add(7);

        printNumbersInRange(listNumber, 0, 7);

        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (lowerLimit <= number && number <= upperLimit) {
                System.out.println(number);
            }
        }

    }
    
}
