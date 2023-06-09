// https://leetcode.com/problems/rotate-image/
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5,6}, {7, 8, 9}};
        printMatrix(arr);
        rotate(arr);
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // Taking Transpose of Matrix
        for(int i = 0; i < row; i++){
            for(int j = i; j< col; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reversing the rows
        for(int i = 0; i < row; i++){
            for(int j = 0; j< row/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
    }
}
