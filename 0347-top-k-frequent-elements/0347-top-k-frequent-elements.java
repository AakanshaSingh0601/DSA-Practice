class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>  map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            }
        
        int n = map.size();
        int grid[] [] = new int[n][2];
        int idx=0;
        for(int key : map.keySet()){
             grid[idx][0] = key;
             grid[idx][1]= map.get(key);
            idx++;
            }
        Arrays.sort(grid, (a,b) -> b[1]- a[1]);
        int ans[] = new int[k];
        
        for(int i =0;i<k;i++){
            ans[i]= grid[i][0];
            }
        return ans;
    }
}


// 1 1 1 2 2 3    2
// 1:3
// 2:2
// 3:1
    
     