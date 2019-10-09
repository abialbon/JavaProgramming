public class RandomWalkers {
    // Performs the RandomWalker for `trials` no of times and computes the
    // average no of steps taken
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double total_count = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0;
            int noSteps = 0;
            while ((Math.abs(x) + Math.abs(y) != r)) {
                int d = (int) (Math.random() * 4);
                if (d == 0) x -= 1;
                else if (d == 1) y += 1;
                else if (d == 2) x += 1;
                else y -= 1;
                noSteps++;
            }
            total_count += noSteps;
        }
        System.out.println("average number of steps = " + total_count/trials);
    }
}
