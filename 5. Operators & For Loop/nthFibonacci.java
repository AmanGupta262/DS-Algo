/**
 * Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
    Provided N you have to find out the Nth Fibonacci Numbe
 */
import java.util.Scanner;
public class nthFibonacci{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n < 1) {
            System.out.print(0);
            return;
        }
        int f1, f2;
        f1 = f2 = 1;
		
        int i = 1;
        while(i <= n-2){
            int t = f1 + f2;
            f2 = f1;
            f1 = t;
            i += 1;
        }
        System.out.print(f1);
	}
}