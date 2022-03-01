// https://leetcode.com/problems/missing-number/

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 4, 2, 3, 5, 7, 0, 1 };
        int n = 9;
        System.out.println(find(arr, n));
    }

    static int find(int[] arr, int n) {
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    static void swap(int s, int e, int[] arr) {
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }

    static void sort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr.length && arr[i] != arr[correct]) {
                swap(i, correct, arr);
            } else {
                i++;
            }
        }
    }
}
