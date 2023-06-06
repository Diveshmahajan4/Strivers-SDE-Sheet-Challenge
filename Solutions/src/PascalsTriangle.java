import java.util.*;
// https://leetcode.com/problems/pascals-triangle/

public class PascalsTriangle {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);

        for (int i = 1; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prev = arr.get(i-1);
            for (int j = 1; j < prev.size(); j++)
            {
                temp.add( prev.get(j-1)+prev.get(j) );
            }
            temp.add(1);
            arr.add( temp);
        }
        return arr;
    }
}
