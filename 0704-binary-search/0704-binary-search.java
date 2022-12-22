class Solution {
    public int search(int[] num, int target) {
        
        return recurse(num,0, num.length-1,target);
        
    }
    private int recurse(int [] nums,int left, int right ,int target){
       if(left>right) return -1;
        int mid = (left+right)/2;
        if(target==nums[mid]) return mid;
        if(target<nums[mid]){
            return recurse(nums, left, mid-1,target);
    }
        else{
            return recurse(nums,mid+1,right,target);
        }
    
    }
}