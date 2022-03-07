public class Counter {
    private int startValue;

    //constructor
    public Counter(int startValue) {
        this.startValue = startValue;
    }

    //overloaded constructor
    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.startValue++;
    }

    public void decrease() {
        this.startValue--;
    }

    //overloaded method
    public void increase(int increaseBy) {

        if (0 > increaseBy) {
            return;
        }
        
        this.startValue = this.startValue + increaseBy;
    }

    //overloaded method
    public void decrease(int decreaseBy) {

        if (0 > decreaseBy) {
            return;
        } 
        
        this.startValue = this.startValue - decreaseBy;
    }
}
