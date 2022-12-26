class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k%n;
         reverse(nums,0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k, n-1);
     
        
    }
    private void reverse(int[] nums,int left , int right){
        while(left<right){
            int temp= nums[left];
            nums[left++]= nums[right];
            nums[right--]= temp;
        }
        
    }
}




//[1,2,3,4,5]   k=2
    
   // 4,5,1,2,3 
     
//[1,2,3,4,5,6,7] k=3
    
   // 7,6,5,4,3,2,1
    //5,6,7,1,2,3,4--->
    