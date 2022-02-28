public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicate(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicate(int[] nums) {
        int len = nums.length;
        if (len < 2)
            return len;

        int i = 1;
        int j = 1;

        while (i < len) {
            if (nums[i] > nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;

    }
}
