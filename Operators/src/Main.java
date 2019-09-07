public class Main {

    public static void main(String[] args) {
        int valueA = 12;
        System.out.println(valueA);

        long valueB = 232L; // This L is not mandatory
        System.out.println(valueB);

        float valueC = 221.994f; // If you omit the f, the compiler complains it's a double
        System.out.println(valueC);

        double valueD = 3.14d; // This d is not mandatory
        System.out.println(valueD);

        System.out.println(valueA / valueC);
        /*
        Operator precedence
        Postfix
        Prefix
        Multiplicative *, /
        Additive +, -
        */

        int val2increment = 3;
        System.out.println(val2increment++);
        System.out.println(++val2increment);
        System.out.println(val2increment);
    }
}