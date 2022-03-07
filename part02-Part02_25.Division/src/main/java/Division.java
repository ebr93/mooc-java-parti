

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        division( 3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        double quotient = 1.0 * numerator  / denominator;
        System.out.println(quotient);
    }
}

/* 
MOOC ANSWER
    public static void division(int numerator, int denominator) {
        System.out.println((1.0 * numerator / denominator));
    
    THEY SIMPLIFIED THEIR ANSWER, IT SHOULD NOT BE THAT BIG OF A DEAL 
*/