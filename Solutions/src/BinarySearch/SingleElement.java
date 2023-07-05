package BinarySearch;
// https://leetcode.com/problems/single-element-in-a-sorted-array/
import java.util.ArrayList;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {130, 200, 200, 279, 279, 342, 342, 348, 348, 430, 430, 492, 492};
        System.out.println(singleNonDuplicate2(arr));
    }

    public static int singleNonDuplicate(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i+=2) {
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }

        return arr[n-1];
    }

    // Binary Search Approach
    public static int singleNonDuplicate2(int[]  arr){
        int low = 0;
        int high = arr.length -2;

        while(low <= high){
//            int mid = (low + high) >> 1;
            int mid = low + (high - low)/2;
            if(arr[mid] == arr[mid ^ 1]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }

        return arr[low];
    }
}
