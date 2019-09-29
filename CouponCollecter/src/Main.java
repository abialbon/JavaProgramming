public class Main {
    // Takes a command line argument and determines how many coupons need to be collected to collect them all
    public static void main(String[] args) {
	// write your code here
        try {
            int value = 0, noIterations = 1000;
            int n = Integer.parseInt(args[0]);
            for(int i = 0; i < noIterations; i++) {
                value += toCollect(n);
            }
            System.out.println("The average over "+noIterations+" for "+n+" coupons is "+value/noIterations);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No number entered!");
        }


    }

    public static int toCollect(int n) {
        boolean[] isCollected = new boolean[n];
        int distinct = 0;
        int count = 0;
        while (distinct < n) {
            count++;
            int r = (int) (Math.random() * n);
            if (!isCollected[r]) {
                isCollected[r] = true;
                distinct++;
            }
        }
        return count;
    }
}
