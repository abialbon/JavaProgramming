public class Minesweeper {
    public static void main(String[] args) {
        // Get m, n, k. m * n - Grid and k - no of mines
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Create a grid of m * n
        char[][] mineLand = new char[m][n];

        // Assign k random mines
        int mineCount = 0;
        while (mineCount < k) {
            int r = (int) (Math.random() * (m*n));
            if (mineLand[r / n][r % n] == 0) {
                mineLand[r / n][r % n] = '*';
                mineCount++;
            }
        }

        // Count the no of mines in all directions
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mineLand[i][j] == '*') { continue; }
                int noMines = 0;
                if (i - 1 >=0 && mineLand[i-1][j] == '*') noMines++;
                if (i - 1 >= 0 && j - 1 >= 0 && mineLand[i-1][j-1] == '*') noMines++;
                if (j - 1 >= 0 && mineLand[i][j-1] == '*') noMines++;
                if (i + 1 < m && j - 1 >= 0 && mineLand[i+1][j-1] == '*') noMines++;
                if (i + 1 < m && mineLand[i+1][j] == '*') noMines++;
                if (i + 1 < m && j + 1 < n && mineLand[i+1][j+1] == '*') noMines++;
                if (j + 1 < n && mineLand[i][j+1] == '*') noMines++;
                if (i - 1 >= 0 && j + 1 < n && mineLand[i-1][j+1] == '*') noMines++;
                mineLand[i][j] = (char) (noMines+'0');
            }
        }

        // Print out the mineLand grid
        for (char[] x: mineLand) {
            for (char y:x) {
                System.out.print(y+"  ");
            }
            System.out.println();
        }
        
    }
}