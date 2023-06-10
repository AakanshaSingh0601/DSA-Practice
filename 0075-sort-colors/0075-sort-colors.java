class Solution {
    public void sortColors(int[] nums) {
        int zeroCount =0;
        int oneCount =0;
        int twoCount =0;
        
      for(int i:nums){
          if(i==0) zeroCount++;
          if(i==1) oneCount++;
          if(i==2) twoCount++;
      }
        int idx=0;
        while(zeroCount-->0){
            nums[idx++]=0;
        }
        while(oneCount-->0){
            nums[idx++]=1;
        }
        while(twoCount-->0){
            nums[idx++]=2;
        }
    }
}