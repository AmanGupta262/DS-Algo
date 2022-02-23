public class sqrt {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(findSqrt(n));
    }

    static int findSqrt(int n) {
        int s = 1;
        int e = n / 2;

        while (s <= e) {
            int m = s + (e - s) / 2;
            long sq = (long) Math.pow(m, 2);
            if (sq == n)
                return m;
            if (sq > n)
                e = m - 1;
            else
                s = m + 1;
        }
        return e;
    }
}
