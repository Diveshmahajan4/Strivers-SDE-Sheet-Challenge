package Heaps;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/top-k-frequent-elements/
public class KFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }
    //  Brute Force Approach
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            map.putIfAbsent(nums[i], 0);
            if (map.get(nums[i]) != null) {
                map.merge(nums[i], map.get(nums[i]), (a, b) -> b + 1);
            }
        }

        Integer[] keyArray = new Integer[map.size()];
        Integer[] valueArray = new Integer[map.size()];
        int s = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            keyArray[s] = key;
            valueArray[s] = value;
            s++;
        }

        int length = keyArray.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int tempKey = 0;
                int tempValue = 0;
                if (valueArray[i] > valueArray[j]) {

                    tempKey = keyArray[i];
                    keyArray[i] = keyArray[j];
                    keyArray[j] = tempKey;

                    tempValue = valueArray[i];
                    valueArray[i] = valueArray[j];
                    valueArray[j] = tempValue;
                }
            }
        }

        for (int i = length-1, j = 0; j < k; i--, j++) {
            ans[j] = keyArray[i];
        }

        return ans;
    }

    // Optimize Approach
     static class Pair{

        int value;

        int frequency;

        public Pair(int value,int frequency){

            this.value = value;

            this.frequency = frequency;

        }

    }

        public static int[] KMostFrequent(int n, int k, int[] arr) {
            // Write your code here
            //this comparator help us to put more fruency element at top priority queue
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
                public int compare(Pair p1,Pair p2){
                    return p2.frequency -p1.frequency;
                }
            });
            //store element and their frequency
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                }
            }
            //store pair contains element and thier frequency as priority in Queue
            for( int key :map.keySet()){
                pq.add(new Pair(key, map.get(key)));
            }
            int ans[] = new int[k];
            ans[0] = pq.remove().value;
            for(int i=1;i<k;i++){
                if(pq.size()!=0){
                    int val = pq.remove().value;
                    //maintance to sort array
                    if(ans[i-1]>val){
                        int temp =ans[i-1];
                        ans[i-1] = val;
                        ans[i] = temp;
                    }
                    else{
                        ans[i] =val;
                    }
                }
            }
            return ans;
        }

}
