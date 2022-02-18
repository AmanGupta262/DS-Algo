// greatest element in array smaller or equal to target
public class findFloorNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 9;

        System.out.println(findFloor(arr, target));
    }

    public static int findFloor(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;

        if (target < arr[s])
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
