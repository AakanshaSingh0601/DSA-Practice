class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int size = map.size();
        int [][] arr = new int[size] [2];
        int idx= 0;
        for(int key: map.keySet()){
            arr[idx][0] = key;
            arr[idx][1] = map.get(key);
            idx++;
        }
        
        Arrays.sort(arr, (a,b) -> b[1] - a[1]);
        for(int i=0;i<k;i++){
            ans[i] = arr[i][0];
        }
            
        return ans;
    }
}


// 1 1 1 2 2 3    2
// 1:3
// 2:2
// 3:1
    
     