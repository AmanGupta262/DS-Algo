public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(orderAgnosticBSFn(0, arr.length - 1, arr, 5));
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(orderAgnosticBSFn(0, arr1.length - 1, arr1, 5));

    }

    public static int orderAgnosticBSFn(int s, int e, int[] arr, int target) {
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
                    System.out.println(atM + " 21 " + (m - 1));
                    e = m - 1;
                }
            } else if (target < atM) {
                if (isAsc) {
                    e = m - 1;
                } else {
                    s = m + 1;
                    System.out.println(atM + " " + (m - 1));
                }
            } else
                return m;
        }
        return -1;
    }
}
