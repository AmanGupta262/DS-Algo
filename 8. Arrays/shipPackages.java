// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class shipPackages {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 1, 1 };
        int days = 4;
        System.out.println(ship(weights, days));
    }

    static boolean isPossible(int[] weights, int days, int max) {
        int count = 1;
        int weight = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weight + weights[i] <= max) {
                weight += weights[i];
            } else {
                count++;
                if (count > days || weights[i] > max) {
                    return false;
                }
                weight = weights[i];
            }
        }

        return true;
    }

    static int ship(int[] weights, int days) {
        int e = 0;
        for (int w : weights) {
            e += w;
        }
        int s = 0;
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (isPossible(weights, days, m)) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return ans;
    }
}
