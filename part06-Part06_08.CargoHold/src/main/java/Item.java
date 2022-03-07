public class Item {
    private String name;
    private int weight;

    //object with 2 variables
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //returns name
    public String getName() {
        return this.name;
    }

    //returns weight
    public int getWeight() {
        return this.weight;
    }

    //print out in this manner
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

}
