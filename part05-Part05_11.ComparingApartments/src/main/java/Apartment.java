
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int total;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.total = squares * pricePerSquare;
    }

    //Lets you know if a house has more square footage than another house
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
        // OPTIMIZED ANSWER
        // return this.squares > compared.squares;
    }

    //Finds price difference between the sale price of two homes
    public int priceDifference(Apartment compared) {
        // First try
        // int priceOriginal = this.squares * this.princePerSquare; //Price for home
        // int priceCompared = compared.squares * compared.princePerSquare; //Price for compared home

        if (this.total >= compared.total) {
            return this.total - compared.total;
        }

        return compared.total - this.total;
    }

    //Let's you know if a house is more expensive than another house
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.total <= compared.total) {
            return false;
        }

        return true;

        //OPTIMIZED ANSWER
        //return this.price() > compared.price();
    }

}
