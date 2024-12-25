
import java.util.Scanner;

class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of integer: ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
        input.close();
        input.close();
    }
}
