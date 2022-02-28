import java.util.Arrays;

public class makeAnagram {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "coats";

        System.out.println(minSteps(s1, s2));
    }

    public static int minSteps(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int c = 0;
        System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
        while (i < arr1.length && j < arr2.length) {
            System.out.println(i + " " + j + " " + c);
            if (arr1[i] < arr2[j]) {
                // System.out.println("26 " + " " + i + " " + j + " " + c);
                c++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                // System.out.println("31 " + " " + i + " " + j + " " + c);
                c++;
                j++;
            } else {
                // System.out.println("35 " + " " + i + " " + j + " " + c);
                i++;
                j++;
            }

        }
        System.out.println(c);
        return c + arr1.length - i + arr2.length - j;

    }
}
