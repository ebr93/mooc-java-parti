import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private ArrayList<String> recipes;

    public Recipe() {
        this.recipes = new ArrayList<>();
    }

    public void setRecipe(String recipeString) {
        this.recipes.add(recipeString);
    }

    public ArrayList<String> getRecipe() {
        return this.recipes;
    }

    //makes a list of namees of ingredients
    public ArrayList<String> nameList() {
        ArrayList<String> namelist = new ArrayList<>();
        int i = 0;

        for (String name : this.recipes) {
            if (i == 0) {
                namelist.add(name);
                i++;
            } else if (name.equals("")) {
                i = 0;
            } else {
                i++;
            }
        }
        return namelist;
    }

    //about to delete
    public ArrayList<String> ingredientList() {
        ArrayList<String> ingredientlist = new ArrayList<>();

        return ingredientlist;
    }

    //makes a list of the times in ingridients
    public ArrayList<Integer> timeList() {
        ArrayList<Integer> timelist = new ArrayList<>();
        int i = 0;

        for (String name : this.recipes) {
            if (i == 1) {
                int integer = Integer.valueOf(name);
                timelist.add(integer);
                i++;
            } else if (name.equals("")) {
                i = 0;
            } else {
                i++;
            }
        }
        return timelist;
    }

    //prints all recipes in list
    public void recipesPrint() {
        int indexSize = timeList().size() - 1;
        int i =0;

        System.out.println("Recipes: ");
        while (i <= indexSize) {
            //Pancake dough, cooking time: 60
            System.out.println(nameList().get(i) + ", cooking time: " + timeList().get(i));
            i++;
        }
    }

    //prints out recipe that is searched by name
    public void recipesSeachByName(String name) {
        int indexSize = timeList().size() - 1;
        int i =0;

        System.out.println("Recipes: ");
        while (i <= indexSize) {
            if(nameList().get(i).contains(name)) {
                System.out.println(nameList().get(i) + ", cooking time: " + timeList().get(i));
            }
            i++;
        }
    }

    //prints out recipes that meet the requirement of time given
    public void recipesSeachByTime(Integer time) {
        int indexSize = timeList().size() - 1;
        int i =0;

        System.out.println("Recipes: ");
        while (i <= indexSize) {
            //Pancake dough, cooking time: 60
            if(timeList().get(i) <= time) {
                System.out.println(nameList().get(i) + ", cooking time: " + timeList().get(i));
            }
            i++;
        }
    }

    //prints out recipees by searching with ingredients
    public void recipesSeachByIngredient(String ingredient) {
        ArrayList<String> loopList = new ArrayList<>();

        //it goes through the whole list of (this.recipes) with a for each loop
        //created a String ArrayList to add the values of each string within it
        //if the string mathced the recipe then the method would print out the String of the Recipe
        //once the list got to a blank space then the list would clear, RESTART THE LIST, TO SEARCH THE NEXT DISH IF IT HAD THE INGREDIENT
        System.out.println("Recipes: ");
        for (String ingredients : this.recipes) {
            loopList.add(ingredients);
            if (ingredients.equals(ingredient)) {
                System.out.println(loopList.get(0) + ", cooking time: " + loopList.get(1));
                continue;
            } else if (ingredients.equals("")){
                loopList.clear();
            }
        }
    }
}