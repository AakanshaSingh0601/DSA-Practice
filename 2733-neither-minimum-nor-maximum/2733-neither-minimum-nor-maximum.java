class Solution {
    public int findNonMinOrMax(int[] nums) {
       Arrays.sort(nums);
        if(nums.length==2 || nums.length==1) return -1;
        return nums[1];
    }
}
