/**
 * You have been given an integer array/list(ARR) of size N which contains
 * numbers from 0 to (N - 2). Each number is present at least once. That is, if
 * N = 5, the array/list constitutes values ranging from 0 to 3 and among these,
 * there is a single integer value that is present twice. You need to find and
 * return that duplicate number present in the array.
 */
public class findDuplicate {
    public static int duplicateNumber(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int t = n - 2;
        int sum = t * (t + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i += 1) {
            arrSum += arr[i];
        }

        return arrSum - sum;
    }
}
