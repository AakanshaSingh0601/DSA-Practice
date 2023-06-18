class Solution {
    public int[] diStringMatch(String s) {
        int [] nums = new int[s.length()+1];
        for(int i=0;i<nums.length;i++){
            nums[i]=i;
        }
        
        int high = nums.length-1;
        int low = 0;
        int [] ans= new int[nums.length];
        int idx=0;
        
        for(char c: s.toCharArray()){
            if(c=='I'){
                ans[idx]=nums[low];
                low++;
            }
            else{
                ans[idx]=nums[high];
                high--;
            }
            idx++;
            
        }
        ans[idx]= nums[high];
        return ans;
        
    }
}

    