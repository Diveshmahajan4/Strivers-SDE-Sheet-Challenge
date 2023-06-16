package Arrays;

import java.util.*;
import java.util.Comparator;

 // https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {
    public static void main(String[] args) {
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        List<int[]> ans=new ArrayList<>();
        int curr[]=intervals[0];
        ans.add(intervals[0]);
        for(int[] next:intervals){
            if(next[0]<=curr[1]){
                curr[1]=Math.max(curr[1],next[1]);
            }
            else{
                curr=next;
                ans.add(curr);
            }
        }
        int[][] arr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
            arr[i]=ans.get(i);

        return arr;
    }


}
