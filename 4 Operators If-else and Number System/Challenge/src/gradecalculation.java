
import java.util.Scanner;

public class gradecalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the grade obtained: ");
        int grade = input.nextInt();
        if (grade > 90 && grade <= 100) {
            System.out.println("A Grade");
        } else if (grade > 75 && grade <= 90) {
            System.out.println("B Grade");
        } else if (grade > 60 && grade <= 75) {
            System.out.println("C Grade");
        } else if (grade > 30 && grade <= 60) {
            System.out.println("D Grade");
        } else if (grade <= 30 && grade > 0) {
            System.out.println("F Grade");
        }
        input.close();
        input.close();
    }
}
