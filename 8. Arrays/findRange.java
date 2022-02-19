
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class findRange {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 8, 8, 8, 10 };
        int target = 9;
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] == -1) {
            System.out.println(Arrays.toString(ans));
            return;
        }
        ans[1] = binarySearch(nums, target, false);
        System.out.println(Arrays.toString(ans));
    }

    public static int binarySearch(int[] nums, int target, boolean start) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (nums[m] == target) {
                ans = m;
                if (start)
                    e = m - 1;
                else
                    s = m + 1;
            } else if (nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return ans;
    }
}
