package Recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class CombinationSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        calculateSum(0 ,arr, target, list, new ArrayList<>());
        return list;
    }

    public static void calculateSum(int index, int[] arr, int target, List<List<Integer>> list, ArrayList<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        // Pick the element
        if(arr[index] <= target){
            ds.add(arr[index]);
            calculateSum(index, arr, target - arr[index], list, ds);
            ds.remove(ds.size() -1);
        }

        // Not pick the element
        calculateSum(index +1, arr, target, list, ds);
    }
}
