
import java.util.Scanner;

class positivenegativezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of integer: ");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("the number is positive");
        } else if (a == 0) {
            System.out.println("the number is zero");
        } else {
            System.out.println("the number is negative");
        }
        input.close();
        input.close();
    }
}
