public class SortHelper {
    public static boolean less(int x, int y) {
        return x < y;
    }

    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int[] arr_copy = new int[hi - lo + 1];
        for (int i = 0; i < arr_copy.length; ++i) {
            arr_copy[i] = arr[lo + i];
        }
        int j = 0;
        int k = mid - lo + 1;
        for (int i = lo; i < hi+1 ; ++i) {
            if (j > mid - lo) arr[i] = arr_copy[k++];
            else if (k > hi-lo) arr[i] = arr_copy[j++];
            else if (SortHelper.less(arr_copy[j], arr_copy[k])) arr[i] = arr_copy[j++];
            else arr[i] = arr_copy[k++];
        }
    }

    public static void p_array(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void p_array(int[] arr, int start, int end) {
        for (int i = start; i < end; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
