package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    public static void main(String[] args) {

    }

    Set<Integer> col = new HashSet<>();
    Set<Integer> leftDiagonal = new HashSet<>();
    Set<Integer> rightDiagonal = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        generate(result, current, 0, n);
        return result;
    }
    public void generate(List<List<String>> result, List<String> current,
                         int row, int n){
        if(row==n){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int column=0;column<n;column++){
            if(col.contains(column) || leftDiagonal.contains(row+column)
                    || rightDiagonal.contains(row-column)){
                continue;
            }

            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                if(j==column){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            current.add(sb.toString());
            col.add(column);
            leftDiagonal.add(row+column);
            rightDiagonal.add(row-column);

            generate(result, current, row+1, n);

            current.remove(current.size()-1);
            col.remove(column);
            leftDiagonal.remove(row+column);
            rightDiagonal.remove(row-column);


        }

    }
}
