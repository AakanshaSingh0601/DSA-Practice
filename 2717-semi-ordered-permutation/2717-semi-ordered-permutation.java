class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int first=0;
        int last=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int cur= nums[i];
            if(cur==1) first=i;
            if(cur==nums.length) last=i;
            }
        count = first + (nums.length-1 - last);
        if(first>last) count--;
        return count;
        }
}
 
// 2 1 4 3 
// 1 - 2-- 0
// 4 - 3 -- n
// 1+(n- )
