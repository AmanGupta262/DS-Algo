/**
 * You have been given an integer array/list(ARR) of size N. Where N is equal to
 * [2M + 1]. Now, in the given array/list, 'M' numbers are present twice and one
 * number is present only once. You need to find and return that number which is
 * unique in the array/list.
 */
public class findUnique {
    public static int find(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 1) {
            boolean isUnique = true;
            for (int j = 0; j < n; j += 1) {
                if (i == j)
                    continue;
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                return arr[i];
        }
        return -1;
    }
}
