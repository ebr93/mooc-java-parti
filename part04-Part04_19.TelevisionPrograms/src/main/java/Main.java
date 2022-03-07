import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String teleShow = scanner.nextLine();

            if (teleShow.equals("")) {
                break;
            }

            System.out.println("Duration: ");
            int teleTime = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(teleShow, teleTime));
        }

        //maximumDuration variable will help with the Condition to decide what to print
        System.out.println("Program's maximum duration? "); 
        int maximumDuration = Integer.valueOf(scanner.nextLine());

        //set condition to only print shows equal or less than maximumDuration
        //I used toString to print the set up used to return values
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maximumDuration) {
                System.out.println(program.toString());
            }
        }

    }
}
