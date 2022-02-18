// Given a characters array letters that is sorted in non-decreasing order and a character target, 
// return the smallest character in the array that is larger than target.
public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';

        System.out.println(nextGreatest(letters, target));
    }

    public static char nextGreatest(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        if (target >= letters[e])
            return letters[0];

        while (s <= e) {
            int m = (s + e) / 2;
            if (letters[m] <= target)
                s = m + 1;
            else
                e = m - 1;
        }
        return letters[s];
    }
}
