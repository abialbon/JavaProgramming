public class MergeSort {
    public static void sort(int[] arr, int lo, int hi) {
        if ((hi - lo) < 2) {
            SortHelper.merge(arr, lo, (hi+lo)/2, hi);
        } else {
            int mid = (hi + lo)/2;
            sort(arr, lo, mid);
            sort(arr, mid + 1, hi);
            SortHelper.merge(arr, lo, mid, hi);
        }
    }

    public static void main(String[] args) {
        int N = 20;
        int[] test = new int[N];
        for (int i =0; i <N; ++i) {
            int r = (int) (Math.random() * 100);
            boolean sign = Math.random() > 0.5;
            test[i] = sign ? r : -r;
        }

        sort(test, 0, test.length -1);
        SortHelper.p_array(test);
    }
}
