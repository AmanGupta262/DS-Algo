public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
        int target = 2;
        int peak = findPeak(arr);
        int first = orderAgnosticBS(0, peak, arr, target);
        if (first != -1) {
            System.out.println(first);
            return;
        }
        System.out.println(orderAgnosticBS(peak + 1, arr.length - 1, arr, target));
    }

    public static int findPeak(int[] arr) {
        int s = 0;
        int l = arr.length - 1;
        int e = l;
        while (s <= e) {
            int m = (s + e) / 2;
            if (m - 1 >= 0 && arr[m] < arr[m - 1])
                e = m - 1;
            else if (m + 1 <= l && arr[m] < arr[m + 1])
                s = m + 1;
            else
                return m;
        }
        return -1;
    }

    public static int orderAgnosticBS(int s, int e, int[] arr, int target) {
        boolean isAsc = false;
        if (arr[s] < arr[e])
            isAsc = true;

        while (s <= e) {
            int m = (s + e) / 2;
            int atM = arr[m];

            if (target > atM) {
                if (isAsc) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else if (target < atM) {
                if (isAsc) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else
                return m;
        }
        return -1;
    }
}
