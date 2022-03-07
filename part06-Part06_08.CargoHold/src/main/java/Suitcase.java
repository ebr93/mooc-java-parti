import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maximumWeight;
    private int itemsWeight;

    //object with 3 variables, 1 being set variable
    public Suitcase(int weight) {
        this.suitcase = new ArrayList<>();
        this.maximumWeight = weight;
        this.itemsWeight = 0;
    }
    
    //adds item to arrayList as long as it follows the rules
    //cannot add a item if it goes over maximum weight
    //adds new item.getWeight to the total weight of all items in list
    public void addItem(Item item) {
        if (this.itemsWeight + item.getWeight() <= this.maximumWeight) {
            this.suitcase.add(item);
            this.itemsWeight += item.getWeight();
        }
    }

    //to print in this certain format, depending on the size of arrayList
    public String toString() {
        //could've used instead
        //if (this.items.isEmpty()) {
        if (this.suitcase.size() == 0) {
            return "no items " + "(0 kg)"; 
        }

        if (this.suitcase.size() == 1) {
            return this.suitcase.size() + " item " + "(" + itemsWeight + " kg)";  
        }

        return this.suitcase.size() + " items " + "(" + itemsWeight + " kg)"; 
    }

    //it sysout each item in the list in order
    //prints each of the items as it goes through loop
    //**ITEM CLASS has already preset how to print items 
    public void printItems() {
        for (Item items: this.suitcase) {
            System.out.println(items);
        }
    }

    //returns the total weight of all items together
    public int totalWeight() {
        return this.itemsWeight;
    }

    //finds the heaviest item in the ArrayList
    public Item heaviestItem() {
        if (this.suitcase.size() == 0) {
            return null;
        }

        Item heaviest = this.suitcase.get(0);
        for (Item listRun : this.suitcase) {
            if (heaviest.getWeight() < listRun.getWeight()) {
                heaviest = listRun;
            }
        }
        return heaviest;
    }
}
