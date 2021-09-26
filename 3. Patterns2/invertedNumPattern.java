// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    
    	int i = 1;
        while(i <= n){
            int j = n;
            while(j >= i){
                System.out.print(n-i+1);
                j -= 1;
            }
            System.out.println();
            i += 1;
        } 
	}
}