
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Take input of first floating integer: ");
        float x1 = input.nextFloat();
        System.out.print("Take input of second floating integer: ");
        float x2 = input.nextFloat();
        float x3 = x1 * x2;
        System.out.println("multiplication of two floating integers is : " + x3);
        input.close();
        input.close();
    }

}
