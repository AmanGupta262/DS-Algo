/** For N = 5
    5432*
    543*1
    54*21
    5*321
    *4321
 */
import java.util.Scanner;
public class numberPattern1 {
    public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        while(i <= n){
            int j = n;
            while(j >= 1){
                System.out.print(j == i ? "*" : j);
                j -= 1;
            }
            System.out.println();
            i += 1;
        }
        
	}
}
