public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        //had to add this condition in case amount was a negative number so it does not affect the value of container
        //I applied a similar condition to remove, but not this condition to amount, which I should have
        if (amount < 0) {
            return;
        } else {
            this.value += amount;
            if (this.value > 100)  {
                this.value = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (this.value - amount < 0) {
            this.value = 0;
        } else {
            this.value -= amount;
        }
    }

    //this will execute whenever a Container object prints
    public String toString() {
        return this.value + ("/100");
    }
}
