package Trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/power-set4302/1#
public class PowerSet {
    public static void main(String[] args) {

    }

    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a=new ArrayList<>();
        String str="";
        powerSet(0, str, s, a);
        Collections.sort(a);
        return a;
    }

    public void powerSet(int i, String str, String s, List<String> ans){
        if(i==s.length()){
            if(!str.isEmpty()){
                ans.add(str);
            }
            return;
        }

        powerSet(i+1, str+s.charAt(i), s, ans);
        powerSet(i+1, str, s, ans);
    }
}
