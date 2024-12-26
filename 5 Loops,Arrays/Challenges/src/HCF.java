import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your number: ");
        int num2 = input.nextInt();
        int HCF = hcf(num1, num2);
        System.out.println("The HCF of " + num1 + " & " + num2 + " is " + HCF);
        input.close();
        input.close();
    }

    public static int hcf(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
