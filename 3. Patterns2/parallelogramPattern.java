/*
 * Write a program to print parallelogram pattern for the given N number of rows.
 * For N = 4
 * ****
 * -****
 * --****
 * ---****
 * 
 * The - represent spaces.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n){
            printPattern(1, i-1, ' ');
            printPattern(1, n, '*');
            i += 1;
            System.out.println();
        }

	}
    public static void printPattern(int start, int end, char ch){
    	while(start <= end){
            System.out.print(ch);
            start += 1;
        }
    }
}
