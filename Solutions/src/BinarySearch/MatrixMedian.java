package BinarySearch;
// https://www.codingninjas.com/studio/problems/matrix-median_8230735?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class MatrixMedian {
    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][] arr = {{1, 3, 8},
                {2, 3, 4},
                {1, 2, 5}};

        System.out.println("The median of the row-wise sorted matrix is: "+
                Findmedian(arr, row, col));
    }

    public static int Findmedian(int[][] arr, int row, int col) {
        int[] median = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                median[index] = arr[i][j];
                index++;
            }
        }
        return median[(row * col) / 2];
    }
}
