
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> numbersList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] arrayInformation = input.split(",");
            namesList.add(arrayInformation[0]);
            numbersList.add(Integer.valueOf(arrayInformation[1]));

        }

        int longestTracker = -1;
        String longestName = " ";
        for (String name : namesList) {
            if (longestTracker < name.length()) {
                longestTracker = name.length();
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);

        int sum = 0;
        for (int number : numbersList) {
            sum+=number;
        }
        System.out.println("Average of the birth years: " + 1.0 * sum / numbersList.size());

    }
    
}

/*

        int sumNumbers = 0;
        int indexTracker = 0;

        int nameTracker = -1;
        String longestName = "none";
        while(true) {

            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int numberAdd = Integer.valueOf(parts[1]);
            sumNumbers = sumNumbers + numberAdd;
            indexTracker++;

            int length = parts[0].length();
            if (nameTracker < length) {
                nameTracker = length;
                longestName = parts[0];

            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumNumbers / indexTracker);

    }
*/