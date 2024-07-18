public static int findCatalan(int n) {
    if (n == 0) {
        return 1;
    }
    
    long[] dp = new long[n + 1];
    int MOD = 1000000007;
    
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
        dp[i] = 0;
        for (int j = 0; j < i; j++) {
            dp[i] += (dp[j] * dp[i - j - 1]) % MOD;
            if (dp[i] >= MOD) {
                dp[i] -= MOD; // Take modulo to prevent overflow
            }
        }
    }
    
    return (int) dp[n];
}
