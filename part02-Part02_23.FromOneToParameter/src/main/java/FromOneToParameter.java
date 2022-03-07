

public class FromOneToParameter {

    public static void main(String[] args) {
        
        System.out.println();
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        
        int printerNum = 1;
        while (printerNum <= number) {
            System.out.println(printerNum);
            printerNum++;
        }
    }
}

/* 
So in this case we do need a variable because there is not a set minimum to start off counting for
number
So (printerNum) starts counting from the bottom up
*/