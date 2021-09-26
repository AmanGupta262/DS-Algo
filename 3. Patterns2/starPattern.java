// Print the following pattern
// Pattern for N = 4
//    *
//   ***
//  *****
// *******
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    	int i = 1;
        while(i <= n){
            int sp = n;
            while(sp > i){
                System.out.print(" ");
                sp -= 1;
            }
            
            int j = 1;
            while(j <= i*2-1){
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
	}
}