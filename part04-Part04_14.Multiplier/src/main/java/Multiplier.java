
public class Multiplier {
    private int number;

    //Constructor
    //Sets the 1st number INSTANCE variable
    public Multiplier(int number) {
        this.number = number;
    }

    //Uses the 1st number INSTANCE variable and multiplies it by the 2nd number variable
    public int multiply(int number) {
        return this.number * number;
    }
}

/*abstract

Multiplier multiplyByThree = new Multiplier(3);

System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

Multiplier multiplyByFour = new Multiplier(4);

System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));

*/