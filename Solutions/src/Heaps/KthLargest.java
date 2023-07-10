package Heaps;
import java.util.*;
// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargest {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}
