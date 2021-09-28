/**
 * You have been given an empty array(ARR) and its size N. The only input taken
 * from the user will be N and you need not worry about the array. Your task is
 * to populate the array using the integer values in the range 1 to N(both
 * inclusive) in the order - 1,3,.......4,2.
 */
public class arrangeArray {
    public static void arrange(int[] arr, int n) {
        // Your code goes here
        int i = 0;
        int j = n - 1;
        int k = 1;

        while (i <= j) {
            arr[i] = k;
            arr[j] = k + 1 > n ? n : k + 1;
            k += 2;
            i += 1;
            j -= 1;
        }
    }
}
