package StartingCalculators;
public class Calculator {
    
    private double initialInvestment;
    private int years;
    private double percentage;
    private int annualInvestment;
    private int start;

    public Calculator(double initialInvestment, int years, double percentage, int annualInvestment, int start) {
        this.initialInvestment = initialInvestment;
        this.years = years;
        this.percentage = 1.0 + percentage / 100.0;
        this.annualInvestment = annualInvestment;
        this.start = start;
    }

    public double getInitialInvestment() {
        return initialInvestment;
    }

    public int getYears() {
        return years;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getAnnualInvestment() {
        return annualInvestment;
    }

    public int getStartYear() {
        return start;
    }


    //A double that only returns (initialInvestment) after all the loops
    public double futureValue() {
        double calculation = 0;

        
        while (years > 0) {
            calculation = ((initialInvestment + annualInvestment) * percentage);
            initialInvestment = calculation;
            years--;
        }

        return initialInvestment;

    }

    //A void that is able to print out during each loop: Return of initialInvestment and start(Year)
    //Adds +1 value to (start)
    //Modifies value of initialInvestment each loop by making it equal to calculation at the end
    public void tableReturn() {
        double calculation = 0;
        System.out.println("");
        
        while (years > 0) {
            calculation = ((initialInvestment + annualInvestment) * percentage);
            initialInvestment = calculation;
            System.out.println(this.start + " Return: " + this.initialInvestment);
            years--;
            start++;
        }
    }

}