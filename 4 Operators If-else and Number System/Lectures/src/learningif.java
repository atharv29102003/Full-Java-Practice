public class learningif {
    public static void main(String[] args) {
        /*
         * boolean isMale = false;
         * String name = "Bob";
         * if (isMale) {
         * System.out.println("Mr." + name);
         * } else {
         * System.out.println("Ms." + name);
         * }
         */
        // if-else ladder
        boolean isSeniorCitizen = false;
        boolean isAdult = true;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else {
            if (isAdult) {
                System.out.println("Hello adult citizen");
            } else {
                System.out.println("Hello child");
            }
        }
    }
}
