class Solution {
    public int jump(int[] nums) {
         int[] dp = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            dp[i] = Integer.MAX_VALUE;
            dp[0] = 0;
        }
        for(int i = 1; i<nums.length; i++){
            for(int j = 0; j<i; j++){
                if(dp[j]!=Integer.MAX_VALUE && j+nums[j]>=i)
                    dp[i] = Math.min(dp[i], dp[j]+1);
            }
        }
        
        return dp[nums.length-1];
    }
}