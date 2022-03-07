
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            
            if ((text.equals(""))) {
                break;
            }

            printer(text);
            
        }

    }

    //THESE DUDES PRETTY MUCH WANTED THE EXTRA SPACE TO BE PRINTED, I MISUNDERSTOOD
    public static void printer(String text) {
        String[] split = text.split(" ");

        int index = 0;
        while (index < split.length) {
            System.out.println(split[index]);
            index++;
        }
    }
}
