public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int min_value = Integer.MAX_VALUE;
            int min_index = i;
            for (int j = i; j < arr.length; ++j) {
                if (arr[j] < min_value) {
                    min_index = j;
                    min_value = arr[j];
                }
            }
            SortHelper.exchange(arr, i, min_index);
        }
    }

    public static void main(String[] args) {
        int[] test = {2, -5, 1, 7, -1, 10};
        sort(test);
        SortHelper.p_array(test);
    }
}
