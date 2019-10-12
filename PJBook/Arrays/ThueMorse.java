public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int s = 0;
        while (Math.pow(2, s) < n) { s++; }
        boolean[] morseSequence = new boolean[(int) Math.pow(2, s)];
        for (int i = 1; i < morseSequence.length; ) {
            for (int j = 0; j < i; j++) {
                morseSequence[i+j] = !morseSequence[j];
            }
            i += i;
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (morseSequence[k] == morseSequence[l]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}