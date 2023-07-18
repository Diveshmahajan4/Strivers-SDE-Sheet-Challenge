package Stack;

import java.util.Arrays;

// https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4 ,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]){
                    if(j+1 < m && nums2[j] < nums2[j+1]){
                        arr[i] = nums2[j+1];
                    }else{
                        arr[i] = -1;
                    }
                }
            }
        }
        return arr;
    }
}
