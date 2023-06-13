// https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(countPaths3(2,3));

    }

    // Brute Force using recursion
    public static int countPaths(int i , int  j, int n, int m){
        if(i >= n || j >= m) return 0;
        if(i == n-1 || j == m-1) return 1;
        return countPaths(i+1, j, n, m) + countPaths(i, j+1, n, m);
    }

    // Using memoization
    public static int countPaths2(int n, int m){
        int[][] memo = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = -1;
            }
        }

        return calculate(0 , 0, n , m ,memo);
    }

    private static int calculate(int i, int j, int n , int m, int[][] memo){
        if(i == n-1 || j == m-1) return 1;
        if(i >= n || j >= m) return 0;

        if(memo[i+1][j] == -1) memo[i+1][j] = calculate(i+1, j, n, m, memo);
        if(memo[i][j+1] == -1) memo[i][j+1] = calculate(i, j+1, n, m, memo);

        return memo[i+1][j] + memo[i][j+1];
    }

    // Most Optimal solution
    public static int countPaths3(int m, int n){
        int N = n+m-2;
        int r = m-1;    
        double ans = 1;

        for (int i = 1; i <= r ; i++) {
            ans = ans * (N-r+i)/i;
        }

        return (int)ans;
    }
}
