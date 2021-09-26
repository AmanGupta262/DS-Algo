/**
 * 
 */
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
		// Write your code hereScanner s= new Scanner (System.in);
        
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long decimal = 0, pv=1;
		while( n >0) {
			int rem = n%2;
			decimal = decimal+ rem * pv;
			n/=2;
			pv*=10;
		}
		System.out.print(decimal);
	}
}
