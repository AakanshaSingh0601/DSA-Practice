class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int pair=0;
        int leftOver=0;
        for(int val:map.values()){
            pair += val/2;
            if(val%2!=0){
                leftOver++;
            }
        }
        ans[0]= pair;
        ans[1]=leftOver;
        
        return ans;
    }
}



// 1,3,2,1,3,2,2

// 1 :30     
// 2: 22    
// 3: 69    
// 4: 9
    
