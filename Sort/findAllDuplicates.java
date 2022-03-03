import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDuplicates(arr).toString());
    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                ans.add(arr[i]);
            }
        }
        return ans;
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
