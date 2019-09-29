public class Main {

    public static void main(String[] args) {
	// Initialize a two dimensional arrays with 7 rows and 3 columns
    // Calculate the row averages in an array
    // Calculate the column averages in an array
        int[][] twoDArrya = new int[7][3];
        for (int i=0; i < 7; i++) {
            for(int j=0; j<3;j++) {
                int r = (int) (Math.random() * 10);
                twoDArrya[i][j] = r;
            }
        }

        int[] rowTotals = new int[7];
        int[] columnTotals = new int[3];

        for(int i = 0; i < twoDArrya.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < twoDArrya[i].length; j++) {
                rowSum += twoDArrya[i][j];
            }
            rowTotals[i] = rowSum;
        }

        System.out.println("The row totals are: ");
        for (int s : rowTotals) {
            System.out.print(s + " ");
        }

        for(int i=0; i < 3; i++) {
            int columnSum = 0;
            for(int j=0; j<twoDArrya.length;j++) {
                columnSum += twoDArrya[j][i];
            }
            columnTotals[i] = columnSum;
        }

        System.out.println("\nThe column totals are: ");
        for (int s: columnTotals) {
            System.out.print(s+" ");
        }
    }
}
