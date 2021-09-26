/**
 * Given a binary number as an integer N, convert it into decimal and print.
    Input format :
    An integer N in the Binary Format
    Output format :
    Corresponding Decimal number (as integer)
 */
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 0;
        for(int i = 1; n>0; i*=2){
            int r = n%10;
            d += i*r;
            n = n/10;
        }
        System.out.print(d);

	}
}
