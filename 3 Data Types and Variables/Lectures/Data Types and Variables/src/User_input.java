import java.util.Scanner;

//idea about how to give input using Scanner and input._____()
public class User_input {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please enter ur name: ");
    String name = input.nextLine();
    System.out.println("Good Morning " + name);
    System.out.print(name + " also tell me your age");
    int age = input.nextInt();
    System.out.print("my age is " + age);
}
}
