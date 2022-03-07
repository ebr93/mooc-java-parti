package StartingCalculators;

import java.util.Scanner;
import java.util.ArrayList;

public class CompoundInterestCalc4 {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //Values of variables that will be used for the class Calculator
        System.out.println("Initial Investment:");
        double savings = Integer.valueOf(scan.nextLine());

        System.out.println("How many years will you invest?");
        int years = Integer.valueOf(scan.nextLine());

        System.out.println("Approximate Annual Yield:");
        double percentage = Double.valueOf(scan.nextLine());

        System.out.println("Annual Investment:");
        int annual = Integer.valueOf(scan.nextLine());

        System.out.println("Start Year: ");
        int start = Integer.valueOf(scan.nextLine());

        //Class Calculator takes variables into account withe the name (data)
        Calculator data = new Calculator(savings, years, percentage, annual, start);

        //Takes (data) and prints out value during each loop through (tableReturn) which changes the value of (initialInvestment)
        data.tableReturn();
        //Prints out value of just (initialInvestment) which was modified through (tableReturn)
        System.out.println("Future Value: " + data.getInitialInvestment());
    }

}
/*
    public static void calculationVariable2(double percentage, int years, double savings, int annual, int start) {
        ArrayList<Double> yearlyReturns = new ArrayList<>();

        double annualInvestment = 0;
        while (years > 0) {
            double calculation = ((savings + annualInvestment) * percentage);
            annualInvestment = annual;
            savings = calculation;
            years--;

            yearlyReturns.add(savings);
        }

        futureReturnTable(yearlyReturns, start);

    }

    public static void futureReturnTable(ArrayList<Double> list, int year) {
        System.out.println("Return by Year");

        year = year + 1;
        for (Double number: list) {
            System.out.println(year + " Return: " + number);
            year++;
        }

    }
    
}
*/

