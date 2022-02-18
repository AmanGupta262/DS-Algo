// Smallest element in array greater or equal to target
public class findCeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 9;

        System.out.println(findCeiling(arr, target));
    }

    public static int findCeiling(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;

        if (target > arr[e])
            return Integer.MIN_VALUE;

        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target)
                return arr[m];
            if (arr[m] < target)
                s = m + 1;
            else
                e = m - 1;
        }
        return arr[s];

    }
}
