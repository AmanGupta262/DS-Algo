import java.util.Scanner;

/*
 * 1 2 3 4 5 5 4 3 2 1
 * 1 2 3 4 * * 4 3 2 1
 * 1 2 3 * * * * 3 2 1
 * 1 2 * * * * * * 2 1
 * 1 * * * * * * * * 1
*/

public class numberAndStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            // first triangle
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(j + " ");
                j += 1;
            }

            // second triangle
            j = n - j + 1;
            while (j > 0) {
                System.out.print("* ");
                j -= 1;
            }

            // third triangle
            j = 4 + i - n;
            while (j > 0) {
                System.out.print("* ");
                j -= 1;
            }

            // fourth triangle
            j = n - i + 1;
            while (j > 0) {
                System.out.print(j + " ");
                j -= 1;
            }

            i += 1;
            System.out.println();
        }
    }
}
