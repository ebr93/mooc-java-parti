
public class DecreasingCounter {
    //Instance variable
    private int value;  // an object variable for storing the value of the counter

    //Constructor
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    //Method prints value
    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    //Method value - 1
    public void decrement() {
        if (value > 0) {
            this.value--;
        }
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }

    //Method sets value to 0
    public void reset() {
        this.value = 0;
    }

    // the other methods go here
}
