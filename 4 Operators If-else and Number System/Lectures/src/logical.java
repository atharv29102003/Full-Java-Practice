import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to system discount calculator ");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you female? (true/false) ");
        boolean isfemale = input.nextBoolean();
        if (age < 5) {
            System.out.println("You got 75% discount");
        } else {
            if (isfemale) {
                System.out.println("You got 50% discount ");
            } else if (age > 60 && !isfemale) {
                System.out.println("You got 25% discount ");
            }
        }
        input.close();
        input.close();
    }
}
