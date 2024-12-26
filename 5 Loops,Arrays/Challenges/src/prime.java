import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        boolean isPrime = isPrime(num1);
        if (isPrime) {
            System.out.println("the number is a prime number ");
        } else {
            System.out.println("It is a composite number");
        }
        input.close();
        input.close();
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
