public class Staircases2 {
    public static int n = 0;
    
    public static void num_ways(int x, int[] y) {
        if (x < 0) return;
        if (x == 0) n++;
        else {
            for(int i = 0; i < y.length; i++) {
                num_ways(x - y[i], y);
            }
        }
    }
    public static void main(String[] args) {
        int noOfSteps = 10;
        int [] stepsCanTake = {1, 3};
        num_ways(noOfSteps, stepsCanTake);
        System.out.println(n);
    }
}