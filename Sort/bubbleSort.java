import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int s, int e) {
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean s = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    s = true;
                    swap(arr, i, j);
                }
            }
            if (!s)
                return;
        }
    }
}
