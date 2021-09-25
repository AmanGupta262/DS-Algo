import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("*");
        int i = 1;
        int t = n * 2 - 1;
        while(i <= t && n > 0){
            System.out.print("*");
            int j = 1;
            if(i <= t/2 + 1){
                printPattern(j, i);
            }
            else{
                int x = t - i + 1;
                printPattern(j, x);
            }

            i += 1;
            System.out.print("*");
            System.out.println();
        }

        System.out.println("*");

    }
    public static void printPattern(int start, int end){
        while( start <= end){
            System.out.print(start);
            start += 1;
        }
        int temp = start - 2;
        while( start <= end * 2 - 1){
            System.out.print(temp);
            temp -= 1;
            start += 1;
        }
    }
}