/** 
 * Print the following pattern for given number of rows.
    Input format :

    Line 1 : N (Total number of rows)

    Sample Input :
    5
    Sample Output :
    1234554321
    1234**4321
    123****321
    12******21
    1********1
 */
import java.util.Scanner;
public class numberStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = n; i >= 1; i -= 1){
            printPattern(n, i);
            printReversePattern(n, i);
            System.out.println();
        }      
	}
    public static void printPattern(int end, int star){
        for(int i = 1; i <= end; i += 1){
            System.out.print(i <= star ? i : "*");
        }
    }
    public static void printReversePattern(int start, int star){
        for(int i = start; i >= 1; i -= 1){
            System.out.print(i <= star ? i : "*");
        }
    }
}
