
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

    //(.isEmpty) should come before the rest so it can run properly. My code wasnt running
    //because I had this firs: 
    //String nme = this.elements.get(0);
    //use of (.length) to see which is the longest
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String nme = this.elements.get(0);

        for (String strng : this.elements) {

            if (nme.length() < strng.length()) {
                nme = strng;
            }
        }
        return nme;
    }
}
