public class searchInRotated {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 2, 3, 4 };
        int target = 4;
        System.out.println(findTarget(arr, target));
    }

    public static int findTarget(int[] arr, int target) {
        int peak = findPivot(arr);
        System.out.println("Peak " + peak);
        int first = binarySearch(0, peak, arr, target);
        if (first != -1) {
            return first;
        }
        return binarySearch(peak + 1, arr.length - 1, arr, target);
    }

    public static int binarySearch(int s, int e, int[] arr, int target) {
        while (s <= e) {
            int m = (s + e) / 2;
            int atM = arr[m];

            if (target > atM) {
                s = m + 1;
            } else if (target < atM) {
                e = m - 1;
            } else
                return m;
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (m < e && arr[m] >= arr[m + 1])
                return m;
            else if (m > s && arr[m] <= arr[m - 1])
                return m - 1;

            if (arr[s] >= arr[m])
                e = m - 1;
            else
                s = m + 1;
        }
        return -1;
    }
}
