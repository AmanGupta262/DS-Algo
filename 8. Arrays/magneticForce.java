
// https://leetcode.com/problems/magnetic-force-between-two-balls/
import java.util.Arrays;

public class magneticForce {
    public static void main(String[] args) {
        int[] position = { 1, 2, 3, 4, 7 };
        int m = 3;
        System.out.println(maxDistance(position, m));
    }

    static boolean isPossible(int[] arr, int m, int max) {
        int count = 1;
        int lastPos = arr[0];
        for (int a : arr) {
            if (a - lastPos >= max) {
                count++;
                lastPos = a;
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }

    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s = 0;
        int e = position[position.length - 1] - position[0];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(position, m, mid)) {
                s = mid + 1;
                ans = mid;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
