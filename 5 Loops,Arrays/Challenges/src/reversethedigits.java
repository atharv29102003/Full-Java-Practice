import java.util.Scanner;

public class reversethedigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        System.out.println("Reverse of the given number is " + reverse(num1));
        input.close();
        input.close();
    }

    public static int reverse(int num) {
        int newnum = 0;
        while (num > 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }
        return newnum;
    }
}