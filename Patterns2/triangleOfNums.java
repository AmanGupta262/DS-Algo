// Print the following pattern for the given number of rows.
// Pattern for N = 4
//    1
//   232
//  34543
// 4567654

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i=1;
        while(i<=n){
            // spaces
            int sp = n;
            while(sp > i){
                System.out.print(" ");
                sp -= 1;
            }
            //first half vertically
            int j = 1;
            int t = i;
            while(j <= i){
                System.out.print(t);
                t += 1;
                j += 1;
            }
            // second half vertically
            t -= 2;
            j = 2;
            while(j <= i){
                System.out.print(t);
                t -= 1;
                j += 1;
            }
            System.out.println();
            i += 1;
        }
	}
}
