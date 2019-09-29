public class Main {

    public static void main(String[] args) {
	    // Initialize an city grid of n
        int N = Integer.parseInt(args[0]);
        int simulationTimes = Integer.parseInt(args[1]);
        int noOfSuccess = 0;

        for(int i = 0; i<simulationTimes; i++) {
            boolean win = true;
            boolean[][] cityGrid = new boolean[N][N];
            int x = N/2, y = N/2;

            while ((x!=0 && x!=N-1) && (y!=0 && y!=N-1)) {
                cityGrid[x][y] = true;
                // Checking if the situation is a dead end
                if (cityGrid[x-1][y] && cityGrid[x+1][y] && cityGrid[x][y-1] && cityGrid[x][y+1]) {
                    win = false;
                    break;
                }

                int r = (int) (Math.random() * 4);
                if (r == 0 && !cityGrid[x-1][y]) x -= 1;
                else if (r == 1 && !cityGrid[x][y-1]) y -= 1;
                else if (r == 2 && !cityGrid[x+1][y]) x += 1;
                else if (r == 3 && !cityGrid[x][y+1]) y += 1;
            }
            if (win) noOfSuccess++;
        }

        System.out.println("No of times simulated: "+simulationTimes);
        System.out.println("Grid: "+N+" x "+N);
        System.out.print("Success: ");
        System.out.printf("%.2f%%\n", (float) noOfSuccess * 100/simulationTimes);
    }
}
