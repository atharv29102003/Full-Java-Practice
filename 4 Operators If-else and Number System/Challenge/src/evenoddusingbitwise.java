
import java.util.Scanner;

public class evenoddusingbitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ur number: ");
        int n = input.nextInt();
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        input.close();
        input.close();
    }
}
