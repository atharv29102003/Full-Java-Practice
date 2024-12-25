
import java.util.Scanner;

public class greatestofthreenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("take input of 3 integers to find the greatest of them");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest");
        } else {
            System.out.println(c + " is the greatest");
        }
        input.close();
        input.close();
    }
}
