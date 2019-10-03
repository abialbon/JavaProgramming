public class Main {

    public static int[] sort(int[] unsorted) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i=0; i<unsorted.length-1;i++) {
                if (unsorted[i] > unsorted[i+1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {
	// write your code here
        int[] anArray = {3, 12, 4, 1, 6, 3, 2, 4};
        anArray = sort(anArray);
        for (int a : anArray) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
