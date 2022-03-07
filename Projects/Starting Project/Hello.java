
import java.util.Scanner;
import java.util.Random;

public class Hello {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        /*
        I'm trying to create a random food generator by using questions and conditionals
        I thought I would have to use a series of strings, but the ANSWER IS MUCH SIMPLER
        */

        System.out.println("Do you know what you want to eat today?");
        String pass = scan.nextLine();
        
        
        /*
        CORRECT IDEA
        String [] restaurants = {"A", "B", "C", "D"}
        Random random = new Random ();
        It is the simplest way to create a RANDOM GENERATOR USING 1 STRING, instead of multiple of them. Sometimes simple
        is the best choice man
        
        ORIGINAL IDEA
        String f1 = "Chic Fil A";
        String f2 = "Mcdonalds";
        String f3 = "Whataburger";
        String f4 = "Raisin Canes";
        String f5 = "Tacos";

        SECOND IDEA
        StringBuilder generatedrestaurant = random.(f1 + f2 + f3 + f4 + f5);
        byte [] array = new byte [f1 + f2 + f3 + f4 + f5];
        THESE RANDOM GENERATORS WORK MOSTLY WITH INTEGERS AND DOUBLES
        new Random().nextBytes(array);
        */
        

        if (pass.equals("yes")) {
            System.out.println("Enjoy your meal!");

        } else if (pass.equals("no")) {
            String [] restaurants = {"Chic Fil A", "McDonalds", "Whataburger", "Raisin Canes", "Tacos"};
            int select = generator.nextInt(restaurants.length);
            System.out.println("Then I'll pick " + restaurants[select] + " for you <3");
        } else {
            System.out.println("Stay within topic");
        }
    }
}
  