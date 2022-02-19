// https://leetcode.com/problems/find-peak-element/submissions/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class findPeark {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (m - 1 >= 0 && arr[m] < arr[m - 1])
                e = m - 1;
            else if (m + 1 < arr.length && arr[m] < arr[m + 1])
                s = m + 1;
            else {

                System.out.println(m);
                return;
            }
        }

    }
}
