
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);
        
        a = a.minus(b);
        System.out.println(a);
    }

}
