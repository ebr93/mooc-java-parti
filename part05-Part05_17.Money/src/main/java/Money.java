
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    // (euros) and (cents) are set to (final)
    // so after variables are set once, they cannot be modified
    // (plus()) method allows them to be modified this way
    // addition of euros and cents is done when setting up (newMoney)
    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;

        if (cents > 99) {
            cents -= 100;
            euros++;
        }

        Money newMoney = new Money(euros, cents);
        return newMoney;
        /*

        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
 
        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }
 
        return new Money(euros, cents);
        
        */
    }

    //checks if value is less than another money variable
    public boolean lessThan(Money compared) {
        //Best answer, always return the statement in question for a boolean method
        //the code below converts the (euros) into (cents) first, THIS ALLOWS IT TO BE COMPARED
        //return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());

        Money newMoney = (Money) compared;



        return (100 * this.euros + this.cents < 100 * newMoney.euros + newMoney.cents);
    }

    //subtracts money
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            cents+=100;
            euros--;
        }

        //if euros are negative then both become 0
        if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        return new Money(euros, cents);

        /*
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        //if minus makes it so that (euro) has a negative value then it all becomes 0
        if (newMoney.euros < 0 && newMoney.cents >= 0) {
            Money newMoneyZero = new Money(0, 0);
            return newMoneyZero;
        }
        //in case there is a subtraction that happens to become negative within (cents), so decimal subtraction happens as it should
        if (newMoney.euros >= 0 && newMoney.cents < 0) {
            Money newMoneyZero = new Money(this.euros - decreaser.euros - 1, (this.cents + 100 - decreaser.cents));
            return newMoneyZero;
        }
        //if in both objects the numbers come out negative then they are both given a value of 0
        if (newMoney.euros < 0 && newMoney.cents < 0) {
            Money newMoneyZero = new Money(0, 0);
            return newMoneyZero;
        }

        return newMoney;



        /*
        Should had made int variables in order to manage these euros and cents variables
        It would have required less coding and complexity *I ADDED TO MANY (IF STATEMENTS)*
        the variables were brought back at the end just to be returned, they were easy to manage in the code below

        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
 
        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }
 
        // if the value becomes negative, return zero
        if (euros < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euros, cents);

        */
    }

}
