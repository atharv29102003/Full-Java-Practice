import java.util.Scanner;

public class compoundintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        float r = input.nextFloat();
        float t = input.nextFloat();
        double compoundintrest = p * Math.pow((1 + r / 100), t);
        System.out.println("Value of compound intrest is : " + compoundintrest);
        input.close();
        input.close();
    }
}
