public class RandomWalker {
    // Prints the steps and the number of random steps to reach a distance of r from the starting point
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int curr_x = 0, curr_y = 0;
        int noSteps = 0;
        while (manhattan_distance(curr_x, curr_y) != r) {
            int d = (int) (Math.random() * 4);
            if (d == 0) curr_x -= 1;
            else if (d == 1) curr_y += 1;
            else if (d == 2) curr_x += 1;
            else curr_y -= 1;
            System.out.println("(" + curr_x + ", " + curr_y + ")");
            noSteps++;
        }
        System.out.println("steps = " + noSteps);
    }

    public static int manhattan_distance(int x, int y) {
        return (int) (Math.abs(x) + Math.abs(y));
    }
}