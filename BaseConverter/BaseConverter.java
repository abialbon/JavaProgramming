public class BaseConverter {
    /*
    A simple method that takes two command line args
    n - Integer and k -Integer between 2 and 16
    and returns the converted form.
    */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        System.out.println(n+" is "+convert(n, k)+" in base " +k);
    }

    public static String convert(int n, int k) {
        if (n < k) return _check(Integer.toString(n));
        else {
            return convert(n/k, k) + _check(Integer.toString(n % k));
        }
    }

    private static String _check(String d) {
        switch(d) {
            case("10"):
                return "A";
            case("11"):
                return "B";
            case("12"):
                return "C";
            case("13"):
                return "D";
            case("14"):
                return "E";
            case("15"):
                return "F";
            default:
                return d;
        }
    }
}