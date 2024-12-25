public class binary {
    public static void main(String[] args) {
        // program to show bitwise and,or,xor,compliment,leftshift and rightshift
        int a = 12;
        int b = 13;
        System.out.println("and of a and b is " + (a & b));
        System.out.println("or of a or b is " + (a | b));
        System.out.println("xor of a xor b is " + (a ^ b));
        System.out.println("compliment of a is " + (~a));
        System.out.println("leftshift a is " + (a << 1));
        System.out.println("rightshift b is " + (b >> 1));
    }
}
