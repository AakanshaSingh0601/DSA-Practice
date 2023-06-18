class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int cur=nums[i];
            int next= nums[i+1];
            int differ= next-cur;
            ans= Math.min(differ,ans);
        }
        
        return ans;
    }
}