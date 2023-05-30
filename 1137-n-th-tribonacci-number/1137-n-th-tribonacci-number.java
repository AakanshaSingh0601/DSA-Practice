class Solution {
    int dp[]= new int[40];
    public int tribonacci(int n) {
     if(n==0)return n;
     if(n==1||n==2) return 1;
     if(dp[n]!=0) return dp[n];
        
        dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];
    }
}



//0 1 2 3 6 
//n = Tn-1 +Tn-2+Tn-3
