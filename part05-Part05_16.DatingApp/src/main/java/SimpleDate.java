
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    //advances by 1 day at a time
    //modifies day, month and year if necessary
    public void advance() {
        this.day++;

        if (this.day > 30) {
            this.day = 1;
            this.month++;

            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    //advances by days at a time and uses a loop to do it
    //uses (advance()) method 
    //(this.) is what allows the process to happen by applying all the variables it has
    public void advance(int howManyDays) {
        int counter = 0;
        while (counter < howManyDays) {
            this.advance();
            counter++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        int counter = 0;
        while (counter < days) {
            newDate.advance();
            counter++;
        }
        return newDate;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
