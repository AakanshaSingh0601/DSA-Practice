class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map= new HashMap<>();
        int res=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
            
              if(map.get(i) == 1)res+=i;
            else if(map.get(i) == 2)res-=i;
        }
        return res;
    }
}