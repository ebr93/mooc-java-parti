import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    //adds gift variable and paremeters to (ArrayList)
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    //gets the total weight of all the packages by adding them
    //use for loop to add
    //(gift.getWeight()) pulls each weight in order as it loops and adds to totalweight
    //return totalWeight;
    public int totalWeight() {
        int sum = 0;

        for (Gift gift : this.gifts) {
            sum = sum + gift.getWeight();
        }
        return sum;
    }
}
