// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        while(i <= n){
            char ch = (char)('A' + n - i);
            int j = 1;
            while(j <= i){
                System.out.print(ch);
                j += 1;
                ch += 1;
            }
            System.out.println();
            i += 1;
        }
	}
}