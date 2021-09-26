/**
 * Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
    Print the prime numbers in different lines.
 */
import java.util.Scanner;
public class allPrimeNumber {
    public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            if(checkPrime(i))
                System.out.println(i);
            i += 1;
        }
	}
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= n/2; i += 1){
            if(n % i == 0) return false;
        }
        return true;
    }
}
