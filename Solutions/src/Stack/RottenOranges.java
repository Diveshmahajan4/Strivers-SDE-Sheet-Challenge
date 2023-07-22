package Stack;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/rotting-oranges/
public class RottenOranges {
    public static class Pair{
        private int row;
        private int col;
        private int time;

        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int cntFresh = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }
        int tm = 0;
        int count = 0;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int time = q.peek().time;
            tm = Math.max(tm, time);
            q.remove();
            for(int i=0; i<4; i++){
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol,tm+1));
                    vis[nrow][ncol] = 2;
                    count++;
                }
            }
        }
        if(cntFresh != count) return -1;
        return tm;
    }

    public static void main(String[] args) {

    }
}
