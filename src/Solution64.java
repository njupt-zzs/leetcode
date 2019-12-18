import java.util.Map;

/**
 * Created by zzs on 2019/9/16 8:32
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {                                      //遍历了每一个格子
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j != grid[0].length - 1)                       //最下行
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                else if (j == grid[0].length - 1 && i != grid.length - 1)                 // 最右列
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else if (j != grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);        //不在边缘，二者取其一
                else                                                                    //右下角
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }

    public int minPathSum1(int[][] grid) {
        int[] dp = new int[grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j != grid[0].length - 1)
                    dp[j] = grid[i][j] + dp[j + 1];
                else if (j == grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + dp[j];
                else if (j != grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
                else
                    dp[j] = grid[i][j];
            }
        }
        return dp[0];
    }

    public int minPathSum2(int[][] grid) {
        int [][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j != 0)
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                else if (j== 0 && i != 0)
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                else if (i != 0 && j != 0)
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

}
