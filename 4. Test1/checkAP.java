/**
 * Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
    Input format :
    Line 1 : n
    Line 2 : n numbers
 */
import java.util.Scanner;
public class checkAP {
    public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = y - x;
        while(i < n - 1){
            if(y - x != d){
                System.out.print(false);
                return;
            }
            x = y;
            y = sc.nextInt();
            i += 1;
        }
		System.out.print(true);
	}
}
