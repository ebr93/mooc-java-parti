
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    //to string whether there no variables, just 1, or 2+
    //this is to set up how to print when called
    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty."; 
        }
        
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + elements.get(0);
        }

        String alphabetSize = "The collection " + this.name + " has " + this.elements.size() + " elements:";

        String alphabetList = "";

        //first loop will have a blank on the (alphabetSize) sentence then (Line) and finally the first word from the list
        for (String words : this.elements) {
            alphabetList = alphabetList + "\n" + words;
        }

        return alphabetSize + alphabetList;
    }
}

/*abstrac
        if (this.elements.size() == 0) {
            return "The collection alphabet is empty."; 
        }

        String alphabetSize = "The collection alphabet has " + this.elements.size() + " element:";

        String alphabetList = " ";
        
        for (String letters: this.elements) {

        }
*/