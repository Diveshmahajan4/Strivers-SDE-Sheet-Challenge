import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(arr));
    }

     public static int majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
         int n =nums.length;

         for (int i = 0; i < n; i++) {
             if(map.containsKey(nums[i])){
                 map.put(nums[i], map.get(nums[i])+1);
             }else{
                 map.put(nums[i], 1);
             }
         }

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if(entry.getValue() > n/2){
                 return entry.getKey();
             }
         }
         return -1;
     }

     // better approach using  Boyer-Moore Majority Vote algorithm
    // https://www.youtube.com/watch?v=nP_ns3uSh80
    public static int majorityElement2(int[] nums){
        int count = 0, maxElement = 0;
        for(int num: nums) {
            if(count == 0) {
                maxElement = num;
            }
            if(num == maxElement) {
                count++;
            } else {
                count--;
            }
        }

        return maxElement;
    }
}
