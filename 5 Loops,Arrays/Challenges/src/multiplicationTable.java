
public class multiplicationTable {
    public static void main(String[] args) throws Exception {
        table(4683);
    }

    public static void table(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
