import java.util.Scanner;

public class negativeToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if (n > 0)
            return;

        n *= -1;

        long bin = 0;
        int p = 0;
        while (n > 0) {
            int bit = n & 1;
            bin = (long) Math.pow(10, p) * bit + bin;
            n >>= 1;
            p += 1;
        }

        System.out.println(bin);
    }
}
