public class Parameters {
    public static void main(String[] args) {
        System.out.println(sumoftwonumbers(2, 5));
        System.out.println(sumoftwonumbers(7, 5));
        System.out.println(sumoftwonumbers(9, 5));
        System.out.println(sumoftwonumbers(-5, 5));
    }

    public static int sumoftwonumbers(int a, int b) {
        System.out.println("First number recieved is: " + a);
        System.out.println("Second number recieved is: " + b);
        int sum = a + b;
        return sum;
    }
}
