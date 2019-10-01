public class Main {

    public static void main(String[] args) {
	    // The grid to be initialized
        int N = Integer.parseInt(args[0]);
        boolean[][] grid = new boolean[N][N];
        int x = N/2, y = N/2;
        grid[x][y] = true;

        while(((x>0 && x<N-1) && (y>0 && y<N-1))) { // Checking if the pointer is at the grid's end
            // Checking for  dead ends
            if (grid[x-1][y] && grid[x+1][y] && grid [x][y-1] && grid[x][y+1]) {
                break;
            }
            int r = (int) (Math.random() * 4);

            // Making a move if it's legal
            if (r==0 && !grid[x-1][y]) x--;
            else if (r==1 && !grid[x][y-1]) y--;
            else if (r==2 && !grid[x+1][y]) x++;
            else if (r==3 && !grid[x][y+1]) y++;
            grid[x][y] = true;
        }

        for (boolean[] r : grid) {
            for (boolean c : r) {
                if (c) System.out.print("x ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
