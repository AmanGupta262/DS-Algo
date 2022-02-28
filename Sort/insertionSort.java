import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 3, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int len = arr.length;
        if (len < 2)
            return;

        int i = 1;
        while (i < len) {
            int j = i - 1;
            int t = arr[i];
            while (j >= 0) {
                if (t < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j + 1] = t;
            i++;
        }

    }
}
