package Recursion;
// https://leetcode.com/problems/subsets-ii/

import java.util.*;
public class Subset2 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        calculateList(0 , arr, new ArrayList<>(), list);
        return list;
    }

    public static void calculateList(int index, int[] arr, ArrayList<Integer> ds, List<List<Integer>> list){
        list.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            calculateList(i+1, arr, ds, list);
            ds.remove(ds.size() -1);
        }
    }
}
