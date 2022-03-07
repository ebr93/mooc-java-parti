
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        BirdsList list = new BirdsList();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin = scan.nextLine();
                Birds newBird = new Birds(name, nameLatin);
                list.setListBirds(newBird);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();

                if (list.checkList(bird).equals("Yes")) { 
                    list.findBird(bird).addObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")) {
                System.out.println(list);
            }

            if (command.equals("One")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();

                System.out.println(list.findBird(bird));
            }

            if (command.equals("Quit")) {
                break;
            }
        }

    }

}

/*abstract
Add - adds a bird
Observation - adds an observation
All - prints all birds
One - prints one bird
Quit - ends the program

*/