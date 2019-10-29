public class SortHelper {
    public static boolean less(int x, int y) {
        return x < y;
    }

    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
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
