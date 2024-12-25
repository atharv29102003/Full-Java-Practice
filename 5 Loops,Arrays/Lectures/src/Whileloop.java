
import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        // int a = 1;
        // while (a <= 100) {
        // System.out.println(a + " ");
        // ++a;
        // }
        // int count = 500;
        // while (count >= 200) {
        // System.out.println(count);
        // count--;
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is : " + inp);
            i++;
        }
        input.close();
        input.close();
    }
}
