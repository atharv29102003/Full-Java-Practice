
import java.util.Scanner;

public class determineleapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give the year value: ");
        int a = input.nextInt();
        if (a % 4 == 0 && a / 100 != 0 || a / 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("this is not a leap year");
        }
        input.close();
        input.close();
    }
}
