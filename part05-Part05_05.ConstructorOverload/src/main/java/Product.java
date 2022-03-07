
public class Product {

    //instance variables
    private String name;
    private String location;
    private int weight;

    //constructor
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    //constructor
    //by using (this) I am able to vary the constructor and modify based on inputs for main program
    //By giving set values or based on input. 
    //It is necessary to always include the first variable based on the (first constructor) for the following to work
    public Product(String name) {
        this(name , "shelf", 1);
    }

    //constructor
    public Product(String name, String location) {
        this(name, location, 1);
    }

    //constructor
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
