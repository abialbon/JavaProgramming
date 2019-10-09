public class RandomWalker {
    // Prints the steps and the number of random steps to reach a distance of r from the starting point
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int noSteps = 0;
        System.out.println("(" + x + ", " + y + ")");
        while ((Math.abs(x) + Math.abs(y)) != r) {
            int d = (int) (Math.random() * 4);
            if (d == 0) x -= 1;
            else if (d == 1) y += 1;
            else if (d == 2) x += 1;
            else y -= 1;
            System.out.println("(" + x + ", " + y + ")");
            noSteps++;
        }
        System.out.println("steps = " + noSteps);
    }
}
