import java.util.Scanner;

//I WAS QUESTIONING MY IMPLEMENTATION OF THE USER INTERFACE IN THIS CASE, BUT I DID IT
//AS EFFICIENTLY AS POSSIBLE, PRETTY MUCH IDENTICAL TO THE ANSWER GIVEN.

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    //this interface runs using JokeManager class and using a scanner for user input
    //(start) method pretty much serves as the user interface to run commands and serve different functions
    //this functions work along the JokeManager class and methods
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
        
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokes.addJoke(joke);
            } else if(command.equals("2")) {
                String drawing = this.jokes.drawJoke();
                System.out.println(drawing);
            } else if(command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            } 
        }
    }
}
