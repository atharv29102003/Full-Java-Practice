
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your number: ");
        int num2 = input.nextInt();
        int lcm = LCM(num1, num2);
        System.out.println("The LCM of " + num1 + " & " + num2 + " is " + lcm);
        input.close();
        input.close();
    }

    public static int LCM(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
