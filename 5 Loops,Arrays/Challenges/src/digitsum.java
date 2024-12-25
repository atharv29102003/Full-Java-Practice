import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num = input.nextInt();
        System.out.println("Sum  of the digits of the number " + (num) + " is " + (sumofdigits(num)));
        input.close();
        input.close();
    }

    public static int sumofdigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}