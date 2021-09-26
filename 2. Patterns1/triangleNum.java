// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 22
// 333
// 4444
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        while( i <= n){
            int j = 1;
            while( j <= i){
                System.out.print(i);
                j += 1;
            }
            System.out.println();
            i += 1;
        }
	}
}
