int m = str1.length();
        int n = str2.length();

        // Create a DP array to memoize result of previous computations
        int[][] dp = new int[m + 1][n + 1];

        // Fill the DP array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to insert all characters of second string
                if (i == 0) {
                    dp[i][j] = j;
                }
                // If second string is empty, only option is to remove all characters of first string
                else if (j == 0) {
                    dp[i][j] = i;
                }
                // If last characters are same, ignore last character and recur for remaining string
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If the last character is different, consider all possibilities and find the minimum
                else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], // Insert
                                 Math.min(dp[i - 1][j],    // Remove
                                          dp[i - 1][j - 1])); // Replace
                }
            }
        }
        // The answer is in the cell dp[m][n]
        return dp[m][n];
    }
