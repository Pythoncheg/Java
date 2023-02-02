package java_project.seminar02;

public class task01 {
    static int lcs(int m, int n, int[][] dp) {

        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if ((m - 1) == (n - 1)) {
            dp[m][n] = 1 + lcs(m - 1, n - 1, dp);
            return dp[m][n];
        }

        dp[m][n] = Math.max(lcs(n - 1, dp), lcs(m - 1, n, dp));
        return dp[m][n];
    }



    static void main(String[] args) {
        int[] x = { 1, 2, 3, 1, 4, 5, 6, 1, 2 };
        int[] y = { 1, 0, 7, 2, 2, 3, 3, 1 };
        int[][] dp = new int[x + 1][y + 1];
        for(int i=0;i<x + 1;i++){
            for(int j=0;j<y + 1;j++){
                dp[i][j] = -1;
            }
        }
 
    System.out.println("Length of LCS is "+lcs(x, y, dp));
  }
}
