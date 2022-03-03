// https://leetcode.com/problems/find-the-duplicate-number/
public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return -1;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1 && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
