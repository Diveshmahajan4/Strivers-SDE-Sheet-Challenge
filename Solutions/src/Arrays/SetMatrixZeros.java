package Arrays;

import java.util.HashSet;
import java.util.Set;
// https://leetcode.com/problems/set-matrix-zeroes/

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int r : row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[r][i] = 0;
            }
        }
        for (int c : col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }

    }
}
