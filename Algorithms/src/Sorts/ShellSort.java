public class ShellSort {
    public static void sort(int[] arr) {
        int h = 1;
        while (h < arr.length) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = 0; i < arr.length; ++i) {
                for (int j = i; j - h >= 0 && SortHelper.less(arr[j], arr[j-h]); j = j - h) {
                    SortHelper.exchange(arr, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int[] test = { 1, 5, 8, 9, 2, 0, -2, 10, 55, 100, -1, 0, 12};
        sort(test);
        SortHelper.p_array(test);
    }
}
