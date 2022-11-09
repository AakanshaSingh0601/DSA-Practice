class Solution {
    public int pivotIndex(int[] nums) {
        int left_Sum =0;
        int total_Sum=0;
        for(int i =0; i<nums.length; i++){
            total_Sum += nums[i];
        }
        for(int i =0; i<nums.length; i++){
            if(i!=0) left_Sum += nums[i-1];
            if(total_Sum -left_Sum - nums[i] == left_Sum){
                return i;
            }
        }
        return -1;
    }
}
        
    