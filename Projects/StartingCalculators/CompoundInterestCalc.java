package StartingCalculators;
import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Determining the variable for yearly investment

        System.out.println("How much do you plan in invensting yearly?");
        int savings = Integer.valueOf(scan.nextLine());

        //Determining the variable of many years this will be invested for

        System.out.println("For how many will you save?");
        int years = Integer.valueOf(scan.nextLine());

        /*
        Have to figure this line out for the future
        System.out.println("How much will your income increase yearly?");
        int income = Integer.valueOf(scan.nextLine());
        */

        //Yield variable 

        System.out.println("what will be the yearly yield?");
        int yield = Integer.valueOf(scan.nextLine());

        //Gives a variable of yield converted into a decimal

        double percentage = (1.0 + (yield / 100.0));

        //Ended up creating a Compound interest calculator, in order to measure it I had to use exponents
        //To use exponents Math.powe(a , b) is used. 

        System.out.println("The amount you will save over the years is:");

        //This is the formula for compound interest
        
        double f1 = savings * (Math.pow(percentage, (1.0 * years)));
        System.out.println(f1);
        
    
    }        
}
