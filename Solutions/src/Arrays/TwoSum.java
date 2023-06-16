package Arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

    }

    // Brute Force Solution
    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] +arr[j] == target){
                    ans[0] = i; ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    // Better Solution
    public int[] twoSum2(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }


}
