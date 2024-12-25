public class Function {
    public static void main(String[] args) {
        System.out.println("In main method");
        greeting();
        System.out.println("Main method complete");

        System.out.println("Pattern 1:");
        pattern1();

        System.out.println("\nPattern 2:");
        pattern2();
    }

    public static void greeting() {
        System.out.println("Good morning from KG Programming");
    }

    public static void pattern1() {
        int rows = 1; // Start with 1 row
        while (rows <= 20) { // Loop until 5 rows
            int i = 0;
            while (i < rows) { // Print '*' equal to the current row number
                System.out.print("* ");
                i++;
            }
            System.out.println(); // Move to the next line
            rows++;
        }
    }

    public static void pattern2() {
        int rows = 6; // Start with 6 rows
        while (rows > 0) { // Loop until no rows are left
            int i = 0;
            while (i < rows) { // Print '*' equal to the current row number
                System.out.print("* ");
                i++;
            }
            System.out.println(); // Move to the next line
            rows--;
        }
    }
}
