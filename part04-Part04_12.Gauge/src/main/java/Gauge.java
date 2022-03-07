

public class Gauge {
    private int value;
//Constructor
    public Gauge() {
    }
//grows the value instance variable's value by one. It does not grow the value beyond five
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }
//decreases the value instance variable's value by one. It does not decrease the value to negative numbers
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}

