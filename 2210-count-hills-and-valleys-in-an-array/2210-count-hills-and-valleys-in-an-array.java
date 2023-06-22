class Solution {
    public int countHillValley(int[] nums) {
        int count =0;
        int prevs =nums[0];
        
        for(int i=1;i<nums.length-1;i++){
               if(prevs<nums[i] && nums[i]>nums[i+1] || prevs>nums[i] && nums[i]<nums[i+1] ){
                   prevs=nums[i];
            count++;
        }
    }
        
       return count; 
    }
}


//2 4 1 1 6 5
// i-1 < i> j


