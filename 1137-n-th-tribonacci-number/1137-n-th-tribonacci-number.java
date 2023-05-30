class Solution {
    int dp[] = new int[38];
    public int tribonacci(int n) {
        if(n == 2) return 1;
        if(n == 1) return 1;
        if(n == 0) return 0;

        if(dp[n] != 0) return dp[n];

        int ans = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);

        dp[n] = ans;
        return ans;
    }
}