/**
 * You have been given an array/list(ARR) of size N. You need to swap every pair
 * of alternate elements in the array/list. You don't need to print or return
 * anything, just change in the input array itself.
 */
public class swapAlternate {
    public static void swapAlternate(int arr[]) {
        // Your code goes here
        int i = 0;
        int n = arr.length;
        while (i + 1 < n) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
            i += 2;
        }
    }
}
