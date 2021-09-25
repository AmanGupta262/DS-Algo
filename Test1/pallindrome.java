import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = n, r=0, sum=0;
        
        while(n>0){
            r = n%10;
            n = n/10;
            sum = sum*10 + r;
        }
        
        if(sum == t)
            System.out.print(true);
        else
            System.out.print(false);

	}
}
