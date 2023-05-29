class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int arr[]: matrix){
            StringBuilder sb = new StringBuilder();
            for(int i:arr){
                sb.append(i);
            }
            String str = sb.toString();
            map.put(str,map.getOrDefault(str,0)+1);
            }
        
        int ans=0;
        for(String key:map.keySet()){
            int same = map.get(key);
            String opp= findOpp(key);
            int freqOpp= map.getOrDefault(opp,0);
            int result = same+ freqOpp;
            ans= Math.max(ans,result);
            }
        return ans;
    }
    
    
    public String findOpp(String str){
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()){
            if(c=='1') sb.append(0);
            else sb.append(1);
        }
        return sb.toString();
    }
}






    