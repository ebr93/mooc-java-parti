
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<>();

        listStrings.add("Hello There");
        listStrings.add("Don't forget about me");
        listStrings.add("This keeps being consistent");
        listStrings.add("With time");

        System.out.println(listStrings);

        removeLast(listStrings);

        System.out.println(listStrings);

        removeLast(listStrings);
        removeLast(listStrings);

        System.out.println(listStrings);
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings){
        if (strings.size() == 0) {
            return;
        }

        int last = strings.size() - 1;
        strings.remove(last);
    }
}
