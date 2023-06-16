package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

// https://www.codingninjas.com/codestudio/problems/count-subarrays-with-given-xor_8230830?challengeSlug=striver-sde-challengev
public class CountSubArrXOR {
    public static void main(String[] args) {

    }

    public static int subarraysXor(ArrayList<Integer> arr, int k) {
        // Write your code here.
        HashMap<Integer, Integer > map = new HashMap<>();
        map.put(0 ,1);
        int xor = 0;
        int count = 0;
        int n = arr.size();

        for (int x : arr) {
            xor = xor ^ x;

            int temp = xor ^ k;
            if(map.containsKey(temp)){
                count += map.get(temp);
            }

            if(map.containsKey(xor)){
                map.put(xor, map.get(xor) +1);
            }else{
                map.put(xor, 1);
            }
        }
        return count;
    }
}
