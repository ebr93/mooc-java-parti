
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    //this is to add variables to the arraylist
    //include the (if) condition to check whether the variable has been added before and the (!) inverts it
    //so if it is already in the list then it does not add the variable
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal); 
        }
    }

    //prints the arraylist by using the usual code to print
    //it does it one by one
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    //(removeAll) clears all of the variables within the ArrayList
    public void clearMenu() {
        this.meals.removeAll(this.meals);
    //  this.meals.clear();
    //does the same thing
    }

}
