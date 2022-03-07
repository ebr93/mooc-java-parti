import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    //including if and if else is benefitial for the following methods
    //add, list, and remove
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }

            //adds values to (this.list)
            //uses methods from (TodoList) class
            if (command.equals("add")) {
                System.out.println("To add: ");
                String add = scanner.nextLine();
                this.list.add(add);
                continue;
            }

            //Prints the list using (TodoList) method called (print)
            if (command.equals("list")) {
                this.list.print();
                continue;
            }

            //uses methods from (TodoList) class
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                this.list.remove(number);
                continue;
            } 
        }
    }
}
