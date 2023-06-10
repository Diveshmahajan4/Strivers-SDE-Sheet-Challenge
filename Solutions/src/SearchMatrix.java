import java.util.*;
public class SearchMatrix {
    public static void main(String[] args) {

    }

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        for(int i=0;i<mat.size();i++) {
            if(mat.get(i).contains(target))
            {
                return true;
            }
        }
        return false;
    }
}
