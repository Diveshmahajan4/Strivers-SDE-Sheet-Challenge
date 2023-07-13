package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

// https://www.codingninjas.com/studio/problems/merge-k-sorted-arrays_8230770?challengeSlug=striver-sde-challenge&leftPanelTab=3
public class MergeKSortedArrays {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<k;i++){
            pq.addAll(kArrays.get(i));
        }

        int i=0;
        while(!pq.isEmpty()){
            al.add(pq.poll());
        }

        return al;
    }
}
