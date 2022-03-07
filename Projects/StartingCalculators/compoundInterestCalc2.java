package StartingCalculators;
import java.util.Scanner;
import java.util.ArrayList;

public class compoundInterestCalc2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Initial Investment:");
        double savings = Double.valueOf(scan.nextLine());

        System.out.println("How many years will you invest?");
        double years = Double.valueOf(scan.nextLine());

        System.out.println("Approximate Annual Yield:");
        double percentage = Double.valueOf(scan.nextLine());

        System.out.println("Annual Investment:");
        int annual = Integer.valueOf(scan.nextLine());

        if (annual > 0) {
            calculationVariable2(percentage, years, savings, annual);

        }

        if (annual <= 0) {
            calculationVariable(percentage, years, savings);

        }

    }

    public static void calculationVariable(double percentage, double years, double savings) {
        percentage = (1.0 + (percentage /100.0));

        double calculation = savings * (Math.pow(percentage, (1.0 * years)));
        System.out.println("Future Value: " + calculation);

    }

    public static void calculationVariable2(double percentage, double years, double savings, double annual) {
        ArrayList<Double> yearlyReturns = new ArrayList<>();

        percentage = (1.0 + (percentage /100.0));
        double annualInvestment = 0;

        while (years > 0) {
            double calculation = ((savings + annualInvestment) * percentage);
            annualInvestment = annual;
            savings = calculation;
            years--;

            yearlyReturns.add(savings);
        }

        System.out.println("Future Value: " + savings);

        System.out.println("Future Return by Year");

        int i = 0;
        int year = 1;
        while (i < yearlyReturns.size()) {
            System.out.println("Year " + year + " Return: " + yearlyReturns.get(i));
            i++;
            year++;
        }

    }
    
    
}