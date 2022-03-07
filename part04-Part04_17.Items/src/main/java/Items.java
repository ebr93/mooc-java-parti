
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String newName = scanner.nextLine();

            if (newName.equals("")) {
                break;
            }

            //an object is added to the list named (items)/new Item object is created (use-inputted object)
            items.add(new Item(newName));

        }

        //loop goes through the item list// sysout(item) goes through each index, works as an index pretty much
        for (Item item: items) {
            System.out.println(item);
        }

    }
}
