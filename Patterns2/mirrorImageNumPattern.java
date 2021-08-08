// Print the following pattern for the given N number of rows.
// Pattern for N = 4
//    1
//   12
//  123
// 1234

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            int sp = i;
            while(sp < n){
                System.out.print(" ");
                sp += 1;
            }
            
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j += 1;
            }
            
            System.out.println();
            i += 1;
        }
	}
}