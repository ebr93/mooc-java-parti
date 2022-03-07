public class Timer {

    //*instance variables*
    //uses the class (Clockhand)
    private ClockHand seconds;
    private ClockHand hundredths;

    //*constructor*
    //defines value for (Timer) class
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    //*method*
    //uses (advance) from (Clockhand) class
    //uses (value) from (Clockhand) class
    public void advance() {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    //*method*
    //uses (toString) from (Clockhand) class
    public String toString() {
        return this.seconds.toString() + ":" + this.hundredths.toString();
    }
}

//(Timer) class works along with (Clockhand) class, (Clockhand) is the base code for movement and establishes the rules
//(Timer) follows along and applies the time units that will be worked with

//we  have 