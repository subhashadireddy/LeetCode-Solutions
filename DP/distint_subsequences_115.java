class Solution {
    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();

        long[][] dp = new long[m + 1][n + 1];

        // Empty target can always be formed in 1 way
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1)) {

                    // Use + Don't use
                    dp[i][j] =
                        dp[i - 1][j - 1] +
                        dp[i - 1][j];

                } else {

                    // Can't use current character
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return (int) dp[m][n];
    }
}
