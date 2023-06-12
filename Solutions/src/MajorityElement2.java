import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
// https://leetcode.com/problems/majority-element-ii/description/
public class MajorityElement2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }

    public static ArrayList<Integer> majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n =nums.length;

        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }


}
