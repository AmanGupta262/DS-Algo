// Print the following pattern for the given number of rows.
// Note: N is always odd.

// Pattern for N = 5
//   *
//  ***
// *****
//  ***
//   *

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = n/2;
        
        int i = 1;
        
        // first half
        while(i <= h){
            // spaces
            int sp = h;
            while(sp >= i){
                System.out.print(" ");
                sp -= 1;
            }
            
            // stars
            int j = 1;
            while(j <= i*2-1){
                System.out.print("*");
                j += 1;
            }
            i += 1;
            System.out.println();
        }
        
        // second half
        i = n - h;
        while(i >= 1){
            // spaces
            int sp = n - h;
            while(sp > i){
                System.out.print(" ");
                sp -= 1;
            }
            
            // stars
            int j = 1;
            while(j <= i*2-1){
                System.out.print("*");
                j += 1;
            }
            i -= 1;
            System.out.println();
        }
	}
}
