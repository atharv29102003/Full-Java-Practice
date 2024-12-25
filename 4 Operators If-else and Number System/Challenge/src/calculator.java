
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Take input of first integer: ");
        int x1 = input.nextInt();
        System.out.print("Take input of second integer: ");
        int x2 = input.nextInt();
        System.out.println(x1 + x2);
        System.out.println(x1 - x2);
        System.out.println(x1 * x2);
        System.out.println(x1 / x2);
        System.out.println(x1 % x2);
        input.close();
        input.close();
    }
}
