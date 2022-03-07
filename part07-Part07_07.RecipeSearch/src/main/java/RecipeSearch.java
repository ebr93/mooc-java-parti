
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    
    public static void main(String[] args) {
        Recipe list = new Recipe();
        Scanner scanner = new Scanner (System.in);
        UserInterface ui = new UserInterface(scanner, list);

        ui.start();
    }
}
