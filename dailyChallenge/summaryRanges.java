import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public static void main(String[] args) {
        int[] arr = { -2147483648, -2147483647, 2147483647 };
        System.out.println(summaryRange(arr));
    }

    public static List<String> summaryRange(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int s = 0;
        int len = nums.length;
        System.out.println("if " + (2147483647 + 2147483647));
        for (int i = 0; i < len; i++) {
            System.out.println(i + " " + s + " " + nums[i]);
            if (i + 1 < len && (nums[i + 1] - nums[i] > 1 || nums[i + 1] - nums[i] < 0)) {
                ans.add(s != i ? nums[s] + "->" + nums[i] : nums[s] + "");
                s = i + 1;
            }
        }
        ans.add(s != len - 1 ? nums[s] + "->" + nums[len - 1] : nums[s] + "");
        return ans;
    }
}
