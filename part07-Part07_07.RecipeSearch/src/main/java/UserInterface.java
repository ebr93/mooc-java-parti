import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Recipe list;

    public UserInterface(Scanner scanner, Recipe list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        Recipe list = this.list;
        System.out.println("File to read: ");
        String file = scanner.next();
        readFile(file, list);
        System.out.println(list.getRecipe());

        while (true) {
            System.out.println("\n");
            System.out.println("Commands: " + "\n" + "list - lists the recipes" + "\n" + "stop - stops the program" + "\n" + "find name - searches recipes by name" + "\n" + "find cooking time - searches recipes by cooking time" + "\n" + "find ingredient - searches recipes by ingredient" + "\n");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            String command1 = command;

            if (command.equals("list")) {
                list.recipesPrint();
            } else if (command1.equals("find name")) {
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                list.recipesSeachByName(name);
            } else if (command1.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                list.recipesSeachByTime(time);
            } else if (command1.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                list.recipesSeachByIngredient(ingredient);
            } else if (command.equals("stop")) {
                break; 
            } else {
                continue;
            }
        }
    }

    public void readFile(String file, Recipe list) {
        try (Scanner scan = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read
            while (scan.hasNextLine()) {
                // we read one line
                String recipeString = scan.nextLine();
                //adds line to list
                list.setRecipe(recipeString);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
