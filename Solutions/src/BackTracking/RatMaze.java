package BackTracking;
// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
import java.util.ArrayList;
import java.util.Collections;

public class RatMaze {
    public static void main(String[] args) {

    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> al = new ArrayList<>();
        paths(m,n,0,0,"",al);
        Collections.sort(al);
        return al;
    }
    public static void paths(int[][] m , int n , int i , int j ,String ans,ArrayList<String> al)
    {
        if(m[i][j]==0)return;
        if(i==n-1 && j==n-1)
        {
            al.add(ans);
            return;
        }
        // choice
        // up
        m[i][j]=0;
        if(j>0 && m[i][j-1]==1)
        {
            paths(m,n,i,j-1 ,ans+"L",al);
        }
        // down
        if(j<n-1 && m[i][j+1]==1)
        {
            paths(m,n,i,j+1,ans+"R",al);
        }
        //left
        if(i>0 && m[i-1][j]==1)
        {
            paths(m,n,i-1,j ,ans+"U",al);
        }
        //right
        if(i<n-1 && m[i+1][j]==1)
        {
            paths(m,n,i+1,j,ans+"D",al);
        }
        m[i][j]=1;
        return;


    }
}
