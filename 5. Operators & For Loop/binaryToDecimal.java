/**
 * Given a binary number as an integer N, convert it into decimal and print.
    Input format :
    An integer N in the Binary Format
    Output format :
    Corresponding Decimal number (as integer)
 */
import java.util.Scanner;

class binaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = 0;
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans += (int) Math.pow(2, p) * digit;
            n /= 10;
            p += 1;
        }
        System.out.print(ans);

    }
}
