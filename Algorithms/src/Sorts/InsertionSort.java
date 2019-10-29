public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i; j > 0 && SortHelper.less(arr[j], arr[j-1]); --j) {
                SortHelper.exchange(arr, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 7, -1, 10};
        sort(test);
        SortHelper.p_array(test);
    }
}
