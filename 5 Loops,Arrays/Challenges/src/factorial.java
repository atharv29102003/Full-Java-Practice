
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        long num = input.nextInt();
        System.out.println("Factorial of the number " + (num) + " is " + (fact(num)));
        input.close();
        input.close();
    }

    public static long fact(long num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);

    }
}
