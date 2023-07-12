package Heaps;

import java.util.*;

// https://www.interviewbit.com/problems/maximum-sum-combinations/
public class MaxSumCombination {
    public static void main(String[] args) {

    }

    // O(n2) complexity bad solution not acceptable
    public int[] solve(int[] A, int[] B, int C) {
        int n = A.length;
        int[] arr = new int[C];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(A[i] + B[j]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < C; i++) {
            arr[i] = list.get(list.size()-1-i);
        }
        return arr;
    }

    // Optimized approach using MaxHeap
    public ArrayList<Integer> solve1(ArrayList<Integer> A, ArrayList<Integer> B, int C)
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b) -> b.sum-a.sum);
        A.sort(Collections.reverseOrder());
        B.sort(Collections.reverseOrder());
        pq.add(new Pair(A.get(0)+B.get(0),0,0));
        HashSet<ArrayList<Integer>> h = new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(0);
        h.add(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<C;i++)
        {
            Pair p=pq.poll();
            int ind1=p.x;
            int ind2=p.y;
            int sum=p.sum;
            ans.add(sum);
            if(ind1+1<A.size() && !h.contains(Arrays.asList(ind1+1,ind2)))
            {
                pq.add(new Pair(A.get(ind1+1)+B.get(ind2),ind1+1,ind2));
                ArrayList<Integer> al= new ArrayList<>();
                al.add(ind1+1);
                al.add(ind2);
                h.add(al);
            }
            if(ind2+1<B.size() && !h.contains(Arrays.asList(ind1,ind2+1)))
            {
                pq.add(new Pair(A.get(ind1)+B.get(ind2+1),ind1,ind2+1));
                ArrayList<Integer> al= new ArrayList<>();
                al.add(ind1);
                al.add(ind2+1);
                h.add(al);
            }
        }
        return ans;
    }
}
class Pair
{
    int sum,x,y;
    Pair(int sum,int x,int y)
    {
        this.sum=sum;
        this.x=x;
        this.y=y;
    }
}
