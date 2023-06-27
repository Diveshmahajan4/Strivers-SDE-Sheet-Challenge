package Recursion;

import java.util.ArrayList;
// https://leetcode.com/problems/permutation-sequence/description/
public class KthPermutation {
    public static void main(String[] args) {

    }

    public String getPermutation(int n, int k) {
        int[] fact = new int[]{1,1,2,6,24,120,720,5040,40320};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return calc(fact,n,k-1,list,0)+"";
    }

    private int calc(int[] fact,int n,int k,ArrayList<Integer> list,int res){
        if(n==0)
            return res;
        res=res*10+list.remove(k/fact[n-1]);
        return calc(fact,n-1,k%fact[n-1],list,res);
    }
}
