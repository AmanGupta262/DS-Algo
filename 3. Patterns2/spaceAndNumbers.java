import java.util.Scanner;

/*       1       1
 *     1 2 1     2
 *   1 2 3 2 1   3
 * 1 2 3 4 3 2 1 4
 */

public class spaceAndNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            // first triangle
            int j = n - i;
            while (j > 0) {
                System.out.print("  ");
                j -= 1;
            }

            // second triangle
            j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j += 1;
            }

            // third triangle
            j = i - 1;
            while (j > 0) {
                System.out.print(j + " ");
                j -= 1;
            }

            i += 1;
            System.out.println();
        }
    }
}
