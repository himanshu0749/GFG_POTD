class Solution {
    private static final int MOD = 1000000007;

    public long findMaxProduct(List<Integer> arr) {
        int n = arr.size();
        if (n == 1) {
            return arr.get(0);
        }
 
        int max_neg = Integer.MIN_VALUE;
        int count_neg = 0, count_zero = 0;
        long prod = 1;
        
        for (int i = 0; i < n; i++) {
            int num = arr.get(i);
            if (num == 0) {
                count_zero++;
                continue;
            }
            if (num < 0) {
                count_neg++;
                max_neg = Math.max(max_neg, num);
            }
            prod = (prod * num) % MOD;
        }

        if (count_zero == n) {
            return 0;
        }

        if (count_neg % 2 == 1) {
            if (count_neg == 1 && count_zero > 0 && count_zero + count_neg == n) {
                return 0;
            }
            prod = (prod * modInverse(max_neg, MOD)) % MOD;
        }

        return (prod + MOD) % MOD;
    }

    private long modInverse(int a, int mod) {
        return pow(a, mod - 2, mod);
    }

    private long pow(int a, int b, int mod) {
        long res = 1;
        long x = a;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            b >>= 1;
        }
        return res;
    }
}
