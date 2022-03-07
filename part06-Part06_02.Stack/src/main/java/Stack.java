import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    //gives true or false based on the size of ArrayList
    public boolean isEmpty() {
        if (this.stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.stack.add(value);
    }

    //returns an arraylist value, which technically prints in order when called
    //first I made a new variable (ArrayList<String>)
    //then I basically broke down (this.stack) with a (for) loop which added to (ArrayList<String>) stacks
    //then I just return (stacks)
    public ArrayList<String> values() {
        ArrayList<String> stacks = new ArrayList<>();

        for (String list : this.stack) {
            stacks.add(list);
        }
        return stacks;
    }
    /*
    public ArrayList<String> values() {
        return this.values;
    }
    */

    //finds the last variable in the ArrayList by implementing (listInverted)
    //Create variable String (take) to get the value in String form
    //Remove such variable from list and return (take)
    public String take() {
        int listInverted = this.stack.size() - 1;
        String take = this.stack.get(listInverted);

        this.stack.remove(listInverted);

        return take;
    }
    /*
    public String take() {
        return this.values.remove(this.values.size() - 1);
    }
    */
}
