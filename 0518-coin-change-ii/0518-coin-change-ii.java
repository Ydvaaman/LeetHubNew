class Solution {

    public int change(int amount, int[] coins) {
        Integer dp[][] = new Integer[coins.length + 1][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], null);
        }
        return countWaysToMakeChange(coins, amount, coins.length, dp);
    }

    public static int countWaysToMakeChange(int denominations[], int value, int n, Integer dp[][]) {
        if (value == 0) {
            return 1;
        }

        if (value < 0 || n == 0) {
            return 0;
        }

        if (dp[n][value] != null) {
            return dp[n][value];
        }

        int include = countWaysToMakeChange(denominations, value - denominations[n - 1], n, dp);
        int exclude = countWaysToMakeChange(denominations, value, n - 1, dp);
        dp[n][value] = include + exclude;
        return dp[n][value];
    }
}
