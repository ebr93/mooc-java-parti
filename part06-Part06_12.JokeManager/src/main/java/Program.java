import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface interface1 = new UserInterface(manager, scanner);
        interface1.start();
    }
}
