
import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float simpleintrest = (p * r * t) / 100;
        System.out.println("Value of simple intrest is : " + simpleintrest);
        input.close();
        input.close();
    }
}
