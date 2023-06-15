import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumK {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum == k) ans = Math.max(ans, i+1);

            long rem = sum -k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                ans = Math.max(ans, len);
            }else{
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static int subarraySum1(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        long sum = nums[0];
        int ans = 0;
        int count = 0;

        while(right < n){
            if(sum == k){
                ans =Math.max(ans, right-left +1);
                count++;
            }
            while(right <= n && sum > k){
                sum -= nums[left];
                left++;
            }
            right++;
            if(right < n) sum += nums[right];
        }

        return ans;
    }
}
