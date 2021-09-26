/**
 * Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
    If C is equal to -
    1, then print the sum
    2, then print the product
    Any other number, then print '-1'
 */
import java.util.Scanner;
public class sumOrProduct {
    public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        if(c < 1 || c > 2){
            System.out.println(-1);
            return;
        }
        
        int s;
        if(c == 1) s = 0;
        else s = 1;
        
        for(int i = 1; i <= n; i += 1){
            s = compute(s, i, c);
        }
        System.out.print(s);
	}
    public static int compute(int s, int n, int c){
        int ans = c == 1 ? s + n : s * n;
        return ans;
    }
}
