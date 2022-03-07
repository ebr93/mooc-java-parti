
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(5);
        numberList.add(7);
        numberList.add(8);
        numberList.add(27);
        numberList.add(-3);

        System.out.println(sum(numberList));

        numberList.add(5);
        numberList.add(11);

        System.out.println(sum(numberList));
    }

    public static int sum(ArrayList<Integer> numbers) {

        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }

        return sum;
    }
}
