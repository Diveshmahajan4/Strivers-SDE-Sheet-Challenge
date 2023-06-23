package Recursion;

import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/subset-sums2234/1
public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(2);
        ArrayList<Integer> list = subsetSums(arr, 3);
        for(int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here

        ArrayList<Integer> list = new ArrayList<>();
        calculateSum(0 , 0, arr, list, N);
        Collections.sort(list);
        return list;

    }

    public static void calculateSum (int index, int sum , ArrayList<Integer> arr, ArrayList<Integer> list, int N){
        if(index == N){
            if(!list.contains(sum)){
                list.add(sum);
            }
            return;
        }

        // pick the element
        calculateSum(index +1, sum + arr.get(index), arr, list, N);

        // Not Picking the element
        calculateSum(index+1, sum, arr, list, N);
    }
}
