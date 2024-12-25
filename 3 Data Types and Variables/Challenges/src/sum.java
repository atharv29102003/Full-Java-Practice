import java.util.Scanner;

public class sum {
public static void main(String[] args) {
    System.out.println("Enter the integer 1: ");
    Scanner input = new Scanner(System.in);
    int integer1 = input.nextInt();
    System.out.println("Enter the integer 2: ");
    int integer2 = input.nextInt();
    System.out.println("sum of two numbers is " + (integer1 + integer2));
    
}
}
