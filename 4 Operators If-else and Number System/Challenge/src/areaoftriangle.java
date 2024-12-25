import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("take the input of base of triangle: ");
        double base = input.nextDouble();
        System.out.print("take the input of height of triangle: ");
        double height = input.nextDouble();
        double area = (0.5) * (base * height);
        System.out.println("Perimeter of triangle is " + area);
        input.close();
        input.close();
    }
}
