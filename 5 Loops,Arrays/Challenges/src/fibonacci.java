
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number to which fibonacci series has to be printed : ");
        int num1 = input.nextInt();
        System.out.println("Here is the fibonacci series");
        printfibonacci(num1);
        input.close();
        input.close();
    }

    public static void printfibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0 ");
        if (num == 0)
            return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
