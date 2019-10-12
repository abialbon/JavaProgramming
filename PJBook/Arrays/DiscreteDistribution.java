public class DiscreteDistribution {
    /*
    For a given m and a list of integers a1, a2, a3 ... an 
    prints out m numbers in range between 1 - n with probablities of a1, a2, a3.....an
    */
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        // Store all the probabilities a1, a2, a3......an
        int[] freqArray = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            freqArray[i-1] = Integer.parseInt(args[i]);
        }
        // Find the cummulative frequency of the integers
        int [] cummArray = new int[freqArray.length];
        for (int i = 0; i < cummArray.length; i++) {
            if (i == 0) cummArray[i] = freqArray[i];
            else cummArray[i] = freqArray[i] + cummArray[i - 1];
        }
        // Traverse through the cumArray m times and return the index+1
        // r is a random number between 0 and the last element of the cumArray
        // for the first largest element > r
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * cummArray[cummArray.length -1]);
            for (int j = 0; j < cummArray.length; j++) {
                if (cummArray[j] > r) {
                    System.out.print(j+1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}