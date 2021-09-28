/**
 * Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
 */
public class returnArraySum {
    public static int sum(int[] arr) {
		//Your code goes here
        int n = arr.length;
        int s = 0;
        for(int i=0; i<n; i++){
            s += arr[i];
        }
        return s;
	}
}
