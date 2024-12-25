
import java.util.Scanner;

public class agedifferenciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the age: ");
        int age = input.nextInt();
        if (age > 0 && age < 13) {
            System.out.println("child");
        }
        if (age >= 13 && age < 30) {
            System.out.println("teen");
        }
        if (age >= 30 && age < 60) {
            System.out.println("adult");
        }
        if (age >= 60) {
            System.out.println("senior citizen");
        }
        input.close();
        input.close();
    }
}
