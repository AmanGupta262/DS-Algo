// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// A
// BC
// CDE
// DEFG
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = 'A';
        
        int i = 1;
        while(i <= n){
            int j = 1;
            while( j <= i){
                System.out.print(ch);
                ch += 1;
                j += 1;
            }
            System.out.println();
            ch = 'A';
            ch += i;
            i += 1;
        }
	}
}