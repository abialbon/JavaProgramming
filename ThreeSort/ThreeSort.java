public class ThreeSort {
	public static void main(String[] args) {
		int minNum = Integer.parseInt(args[0]);
		int midNum = Integer.parseInt(args[0]);
		int maxNum = Integer.parseInt(args[0]);

		for(int i = 1; i < 3; i++) {
            int n = Integer.parseInt(args[i]);
			if (n < minNum) {
				midNum = minNum;
				minNum = n;
			}
			else if (n > maxNum) {
				midNum = maxNum;
				maxNum = n;
			}
		}
		System.out.printf("%d %d %d\n", minNum, midNum, maxNum);
	}
}
