public class searchInInfinite {
    public static void main(String[] args) {
        // Let's assume it is infinite array
        int[] arr = { 2, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15 };
        int target = 1;

        int s = 0;
        int e = 1;
        System.out.println(binarySearch(s, e, arr, target));
    }

    public static int binarySearch(int s, int e, int[] arr, int target) {
        while (arr[e] < target) {
            int newS = e + 1;
            e = e + (e - s + 1) * 2;
            s = newS;
        }
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target)
                return m;
            if (arr[m] < target)
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;

    }
}
