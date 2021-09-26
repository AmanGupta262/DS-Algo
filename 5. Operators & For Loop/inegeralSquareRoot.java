/**
 * Given a number N, find its square root. You need to find and print only the integral part of square root of N.
    For eg. if number given is 18, answer is 4.
 */
import java.util.Scanner;
public class inegeralSquareRoot {
    public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 0){
            System.out.print(n);
            return;
        }
        
        for(int i = 1; i <= n; i += 1){
            if(i * i > n || i * i == n ){
                
                System.out.print(i * i > n ? i - 1 : i);
                return;
            }
        }
	}
}
