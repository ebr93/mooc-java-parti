

public class Debt {
    //Instance Variables
    private double balance;
    private double interestRate;

    //Constructor for Debt's Instance Variables
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    //Method, prints balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    //Method, prints Balance with interest of 1 year
    // balance * interesRate
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }    
}
