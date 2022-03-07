public class Fitbyte {
    //instance variables
    private int age;
    private int restingHeartRate;

    //constructor = variable values are entered in program
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    //method = applies the variable (percentage) from program and returns a (double) value
    //Applies the Karvonen Method formula to find the target heart rate
    public double targetHeartRate(double percentageOfMaximum) {
        return ((206.3 - (0.711 * age)) - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}