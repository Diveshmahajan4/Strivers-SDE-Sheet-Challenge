package Stack;

import java.util.Arrays;
import java.util.Stack;

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
        Arrays.fill(arr, -1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j +1; k < m; k++){
                        if(nums2[k] > nums2[j]){
                            arr[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return arr;
    }

    // Similar problem finding next grater element of each element in the array.
    public static int[] nextGreater(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ng = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            if (stack.isEmpty())
                ng[i] = -1;
            else
                ng[i] = stack.peek();
            stack.push(arr[i]);
        }
        return ng;
    }
}
