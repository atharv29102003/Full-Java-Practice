
import java.util.Scanner;

public class farenheittocelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the value in farenheit: ");
        double f = input.nextDouble();
        double c = ((f - 32) * 5.0f) / 9.0f;
        System.out.println("Value in degree farenheit in celcius is " + c);
        input.close();
        input.close();
    }
}
