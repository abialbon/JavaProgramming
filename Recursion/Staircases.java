public class Staircases{
    public static int num_ways(int x) {
        if (x < 0) return 0;
        if (x == 0) return 1;
        return num_ways(x -1) + num_ways(x - 2);
    }

    public static void main(String[] args) {
        int noOfSteps = 2;
        int noOfWays = num_ways(noOfSteps);
        System.out.println(noOfWays);
    }
}