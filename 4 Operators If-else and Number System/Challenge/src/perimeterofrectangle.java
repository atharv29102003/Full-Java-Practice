
import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("take the input of length of rectangle: ");
        int length = input.nextInt();
        System.out.print("take the input of breadth of rectangle: ");
        int breadth = input.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is " + perimeter);
        input.close();
        input.close();// is used to free the allocated resources by input
    }

}
