import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // indices:       0  1  2  3   4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    //finds the smallest number in the array
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }

        return smallest;
    }

    //finds the index of the smallest number
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int smallest = array[0];
        int indexTracker = 0;

        for (int number : array) {
            if(smallest > number) {
                smallest = number;
                index = indexTracker;
                indexTracker++;
                continue;
            }
            indexTracker++;
        }

        return index;
    }

    //create these extra variables to find the index of smallest number from set Index (startIndext) given
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int indexTracker = 0;
        int smallest = table[startIndex];
 
        //for each loop runs through the array and if condition allows to be interact with only once it has met with (startIndex)
        //at the end we return index of the smallest number
        for (int number : table) {
            if (index <= indexTracker && smallest > number) {
                smallest = number;
                index = indexTracker;
                indexTracker++;
                continue;
            }
            indexTracker++;
        }
        return index;
    }

    //swaps the values of (index1) and (index2) within the array
    //create 2 extra int variables in order to do it
    public static void swap(int[] array, int index1, int index2) {
        int numberOne = array[index1];
        int numberTwo = array[index2];

        array[index1] = numberTwo;
        array[index2] = numberOne;
    }

    public static void sort(int[] array) {
        int indexTracker = 0;
        //it sorts the smallest number from beginning of array to end
        //it then prints it in each iteration
        //(index) becomes the number of array[i] on the iteration its on
        //that is why I needed (indexTracker) and a third variable called (numberOrder) because its going to swap values with (smallestNumber)
        for (int number :  array) {
            int numberOrder = indexTracker;
            int smallestNumber = indexOfSmallestFrom(array, numberOrder);
            swap(array, numberOrder, smallestNumber);
            //this is how you print out the array from a method
            System.out.println(Arrays.toString(array));
            indexTracker++;
        }
    }
}
