import java.util.Arrays;

class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 3, 3, 5 };
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
            int index = -1;
            int t = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < t) {
                    index = j;
                    t = arr[j];
                }
            }
            if (index != -1)
                swap(arr, i, index);

        }
    }
}