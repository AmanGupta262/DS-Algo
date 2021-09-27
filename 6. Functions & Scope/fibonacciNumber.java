/**
 * Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
    Fibonacci Series is defined by the recurrence
        F(n) = F(n-1) + F(n-2)
    where F(0) = 0 and F(1) = 1


    Input Format :
    Integer N
    Output Format :
    true or false
 */
public class fibonacciNumber {
    public static boolean checkMember(int n){
				
		int t1=0, t2=1;
        while(t2<n){
            int t = t1+t2;
            t1 = t2;
            t2 = t;
        }
        if(t2 == n || n==0)
        	return(true);
        else
            return(false);

	}
}
