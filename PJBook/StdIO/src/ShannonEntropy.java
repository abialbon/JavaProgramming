public class ShannonEntropy {
    public static void main(String[] args) {
        int m = StdIn.readInt();
        int[] frequencyArray = new int[m];
        int totalCount = 0;

        while(!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            frequencyArray[i-1]++;
            totalCount++;
        }

        double shannonEntropy = 0.;
        for (int i = 0; i < m; i++) {
            double proportions = 0.;
            if (frequencyArray[i] != 0) {
                proportions = (double) frequencyArray[i] / totalCount;
                shannonEntropy -= proportions * (Math.log10(proportions) / Math.log10(2));
            }
        }

        System.out.println(shannonEntropy);
    } // main()
}
