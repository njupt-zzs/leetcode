public class Solutionl {            //很经典的一种数学迭代方法
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
        return dp[n];
    }

    public static void main(String[] args) {
        Solutionl solutionl = new Solutionl();
        solutionl.climbStairs(3);
    }
}
