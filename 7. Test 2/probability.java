/**
 * An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
    Find your answer multiplied by 100 and return the integer part.
    All required values for computation will be in integer range.
    x is always less than equal to 4 and x is always less than equal to n.
    Input format :
    Two spaced integers : n and x
    Output format :
    Integer part of (Probability * 100). 
 */
public class probability {
    public static int probability(int n,int x){
        double den = nCR(8, n);
        double red = nCR(4, x);
        double nred = nCR(4, n-x);
        double num = red * nred;
        double result = num / den;
        return (int)(result * 100);

    }
    public static double nCR(int n, int r){
        int num = fact(n);
        int den = fact(r) * fact(n - r);
        double ans = num / den;
        return ans;        
    }
    public static int fact(int n){
        int f = 1;
        while(n > 1){
            f *= n;
            n -= 1;
        } 
        return f;
    }
}
