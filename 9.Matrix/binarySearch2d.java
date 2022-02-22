public class binarySearch2d {
    public static void main(String[] args) {
        int[][] mat = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };

        int target = 50;

        int[] ans = binarySearch(mat, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] binarySearch(int[][] mat, int target) {
        int row = 0;
        int col = mat[0].length - 1;

        while (col >= 0 && row <= mat.length - 1) {
            if (target < mat[row][col])
                col--;
            else if (target > mat[row][col])
                row++;
            else {
                return new int[] { row, col };
            }
        }
        return new int[] { -1, -1 };
    }
}
