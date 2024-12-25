import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating a programme for swapping ");
        System.out.println("input the first integer: ");
        int a = input.nextInt();
        System.out.println("input the second integer: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping Done ......");
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
        input.close();
        input.close();
    }
}