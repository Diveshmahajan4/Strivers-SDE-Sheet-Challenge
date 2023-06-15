import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutive {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int len = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i]-1 == lastSmaller){
                len++;
                lastSmaller = nums[i];
            }else if(nums[i] != lastSmaller){
                len = 1;
                lastSmaller = nums[i];
            }

            ans = Math.max(ans, len);
        }
        return ans;
    }

    // Optimal Solution
    public static int longestConsecutive2(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for(int x : set){
            if(!set.contains(x-1)){
                int len = 1;
                int temp = x;
                while(!set.contains(x+1)){
                    x++;
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}
