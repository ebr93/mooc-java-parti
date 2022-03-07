
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);


        date.advance(790);
        
        System.out.println(date);
    
        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        //    System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
