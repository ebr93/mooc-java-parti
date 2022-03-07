
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class


        //ArrayList over Personal Information Class
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String fName = scanner.nextLine();

            if (fName.equals("")) {
                break;
            }

            System.out.println("Last name: ");
            String lName = scanner.nextLine();

            System.out.println("Identification number: ");
            String iNumber = scanner.nextLine();

            //refers to created ArrayList of (Personal Information) called (infoCollection) where objects are added and second part adds new variables
            infoCollection.add(new PersonalInformation(fName, lName, iNumber));
        }

        //using for-each loop to and use class methods to only get the first name and last name printed
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
