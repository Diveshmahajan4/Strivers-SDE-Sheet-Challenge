package Greedy;

import  java.util.*;
// https://www.codingninjas.com/studio/problems/minimum-number-of-platforms_8230720?challengeSlug=striver-sde-challenge
public class MinimumPlatform {
    public static void main(String[] args) {

    }

    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i = 1;
        int j = 0;
        int need = 1;
        int max = 1;
        while(i<n && j<n){
            if(at[i] <= dt[j]){
                need++;
                i++;
            }
            else if(at[i] > dt[j]){
                need--;
                j++;
            }
            max = Math.max(max, need);
        }
        return max;
    }
}
