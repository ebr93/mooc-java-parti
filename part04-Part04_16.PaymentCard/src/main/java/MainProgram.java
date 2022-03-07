
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard paulscard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulscard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulscard);
        System.out.println("Matt: " + mattsCard);

        paulscard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulscard);
        System.out.println("Matt: " + mattsCard);

        paulscard.eatAffordably();
        paulscard.eatAffordably();
        mattsCard.addMoney(50);
        
        System.out.println("Paul: " + paulscard);
        System.out.println("Matt: " + mattsCard);
    }
}
