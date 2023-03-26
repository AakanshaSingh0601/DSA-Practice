class Solution {
    public int pivotIndex(int[] nums) {
     int n= nums.length;
     int sumLeft[] = new int[n];
     int sumRight[]= new int[n];
        sumLeft[0] = nums[0];
        for(int i=1;i<n;i++){
            sumLeft[i]= nums[i] +sumLeft[i-1];
        }
        sumRight[n-1]= nums[n-1];
        for(int i=n-2; i>=0; i--){
            sumRight[i]= nums[i]+ sumRight[i+1];
        }
        for(int i=0; i<n;i++){
            if(sumLeft[i] == sumRight[i])
                return i;
        }
       return -1; 
    }
}
        
//
// [1,7,3,6,5,6] 
//lS[1,8,11,17,22,28]          
//rs[28,27,20,17,11,6]