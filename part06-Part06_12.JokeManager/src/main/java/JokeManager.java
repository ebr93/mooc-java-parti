import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    //adds a String to the ArrayList
    public void addJoke(String joke) {
        jokes.add(joke);
    }

    //draws a joke at random, using a Random tool
    //returns the random index number to select joke
    //if empty returns a message
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    //Prints the joke in order that they were input
    public void printJokes() {
        //I don't understand why the line below didn't let the code work
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
