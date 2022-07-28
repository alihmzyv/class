package july2822;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int sumOfLeftToRightDiagonal = 0;
        int sumOfRightToLeftDiagonal = 0;

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            sumOfLeftToRightDiagonal += arr[i][i];
            sumOfRightToLeftDiagonal += arr[i][j];
        }

        return Math.abs(sumOfLeftToRightDiagonal - sumOfRightToLeftDiagonal);
    }
}
