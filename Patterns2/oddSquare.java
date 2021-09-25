/**
 * For N = 4
    1357
    3571
    5713
    7135
 */
import java.util.Scanner;
public class oddSquare {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while( i <= n){
            int j = 1;
            int t = i;
            while(j <= n){
                System.out.print(t * 2 - 1);
                t += 1;
                if(t > n) t = 1;
                j += 1;
            }
            System.out.println();
            i += 1;
        }
	}
}
