import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
                continue;
            } 
            
            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String translatedWord = scanner.nextLine();

                //this is the problem that I had most of the time, and this condition is the solution
                // this.dictionary.translate(translatedWord) != null
                //it avoids a null value to be represented in TextUI
                //same effect
            //  if (this.dictionary.translate(translatedWord) == null)
                if (this.dictionary.translate(translatedWord) != null) {
                    System.out.println("Translation: ");
                    System.out.println(this.dictionary.translate(translatedWord));
                    continue;
                }

                System.out.println("Word " + translatedWord + " was not found");
                continue;
            } 
            
            System.out.println("Unknown command");
        
        }  
    }
}
