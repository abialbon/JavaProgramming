public class RandomWalkers {
    // Performs the RandomWalker for `trials` no of times and computes the
    // average no of steps taken
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double total_count = 0;
        for (int i = 0; i < trials; i++) {
            int curr_x = 0, curr_y = 0;
            int noSteps = 0;
            while (manhattan_distance(curr_x, curr_y) != r) {
                int d = (int) (Math.random() * 4);
                if (d == 0) curr_x -= 1;
                else if (d == 1) curr_y += 1;
                else if (d == 2) curr_x += 1;
                else curr_y -= 1;
                noSteps++;
            }
            total_count += noSteps;
        }
        System.out.println("average number of steps = " + total_count/trials);
    }

    public static int manhattan_distance(int x, int y) {
        return (int) (Math.abs(x) + Math.abs(y));
    }
}