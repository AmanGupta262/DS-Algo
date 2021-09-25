import java.util.Scanner;

/**
 * For N=3
    1=1
    1+2=3
    1+2+3=6
 */
import java.util.Scanner;
public class sumPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            int s = 0;
            int j = 1;
            while(j <= i){
                System.out.print(j > 1 ? "+"+j : j);
                s += j;
                j += 1;
            }
            System.out.print("="+s);
            System.out.println();
            i += 1;
        }
    }
}
