// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC
import java.util.Scanner;

public class alphaPattern {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = 'A';
        
        int i = 1;
        while( i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(ch);
                j += 1;
            }
            System.out.println();
            i += 1;
            ch += 1;
        }
	}
}