package StartingCalculators;

import java.util.Scanner;
import java.util.ArrayList;

public class CompounInterestCalc3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Initial Investment:");
        double savings = Double.valueOf(scan.nextLine());

        System.out.println("How many years will you invest?");
        double years = Double.valueOf(scan.nextLine());

        System.out.println("Approximate Annual Yield:");
        int percentage = Integer.valueOf(scan.nextLine());

        System.out.println("Annual Investment:");
        int annual = Integer.valueOf(scan.nextLine());

        if (annual > 0) {
            System.out.println("Start Year: ");
            int start = Integer.valueOf(scan.nextLine());

            calculationVariable2(percentage, years, savings, annual, start);

        }

        if (annual <= 0) {
            calculationVariable(percentage, years, savings);

        }

    }

    public static void calculationVariable(double percentage, double years, double savings) {

        double calculation = savings * (Math.pow(percentageCalculator(percentage), (1.0 * years)));

        futureValue(calculation);

    }

    public static void calculationVariable2(double percentage, double years, double savings, double annual, int start) {
        ArrayList<Double> yearlyReturns = new ArrayList<>();

        double annualInvestment = 0;
        while (years > 0) {
            double calculation = ((savings + annualInvestment) * percentageCalculator(percentage));
            annualInvestment = annual;
            savings = calculation;
            years--;

            yearlyReturns.add(savings);
        }

        futureValue(savings);

        futureReturnTable(yearlyReturns, start);

    }

    public static double percentageCalculator(double number) {
        double percentage = (1.0 + (number /100.0));
        return percentage;
    }

    public static void futureValue(Double number) {
        System.out.println("Future Value: " + number);
    
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
