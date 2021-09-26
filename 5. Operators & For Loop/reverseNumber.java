/**
 * Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
    Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

    Input format :
    Integer N
 */
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(; n>0; n=n/10){
            int r = n%10;
            sum = sum*10 + r;
        }
        System.out.println(sum);

	}
}
