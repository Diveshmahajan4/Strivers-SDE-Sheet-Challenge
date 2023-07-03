package Arrays;

import java.util.*;

public class ADemo {
    public static void main(String[] args) {
        System.out.println(buddyStrings("a", "a"));
    }

    public static boolean buddyStrings(String s, String goal) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i< n; i++){
            if(s.charAt(i) != goal.charAt(i)){
                list1.add(s.charAt(i));
                list2.add(goal.charAt(i));
            }
        }

        if(list1.size() != 2) return false;

        if(list1.get(1) == list2.get(0) || list1.get(0) == list2.get(1)){
            return true;
        }else{
            return false;
        }
    }
}
