public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalCount = 0;
        double fraction = 0;
        System.out.printf("%d %d %f\n", 1, 0, 0d);
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 0; j < trials; j++) {
                int r = (int) (Math.random() * n);
                for (int k = 1; k < i; k++) {
                    if (((int) (Math.random() * n)) == r) {
                        count++;
                        break;
                    }
                }

            }
            totalCount += count;
            fraction = (double) totalCount / trials;
            System.out.printf("%d %d %.6f\n", i, count, fraction);
            if (fraction >= 0.5) { break; }
        }

    }
}