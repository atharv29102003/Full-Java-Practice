public class TypeConversion {
public static void main(String[] args) {
//    Implicit type conversion
    float ft = 5L;//conversion of float into long
    System.out.println(ft);
//    explicit type conversion
    int myInt = (int) 5.5f;
    System.out.println(myInt);
}
}
