package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
 // https://www.codingninjas.com/codestudio/problems/missing-and-repeating-numbers_8230733?challengeSlug=striver-sde-challenge&leftPanelTab=1

public class MissingAndRepeating {
    public static void main(String[] args) {

    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        HashMap<Integer ,Integer> map = new HashMap<>();
        int[] arr1 = new int[2];

        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), 1+map.get(arr.get(i)));
            }else{
                map.put(arr.get(i), 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if(!map.containsKey(i)){
                arr1[0] = i;
            }else{
                if(map.get(i) > 1){
                    arr1[1] = i;
                }
            }
        }

        return arr1;
    }
}
