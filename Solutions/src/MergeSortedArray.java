import java.util.Arrays;
 // https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 6, 8, 9};
        int[] arr2 = {1, 5, 7};
        System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, 5,3)));
    }

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[n+m];
        while(i < m && j < n){
            if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                k++;j++;
            }else{
                arr[k] = arr1[i];
                k++;i++;
            }
        }

        while( i < m){
            arr[k] = arr1[i];
            k++;i++;
        }

        while( j < n){
            arr[k] = arr2[j];
            k++;j++;
        }
        return arr;
    }
}
