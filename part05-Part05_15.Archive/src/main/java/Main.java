
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Toy> toys = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // add variables to (toy)
            Toy toy = new Toy(identifier, name);
            // if (toys) contains (toy) identifier then loop continues to next iteration
            // otherwise it adds to list
            if (toys.contains(toy)) {
                continue;
            } else {
                toys.add(toy);
            }
        }
        
        System.out.println("==Items==");
        //(for) looop to print out each of the parts from the (toys) arraylist in order
        for (Toy toy : toys) {
            System.out.println(toy.getIdentifier() + ": " + toy.getName());
        }
    }
}
