class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char cur= chars.charAt(i);
            map.put(cur,vals[i]);
        }
        int n = s.length();
        int arr[]= new int [n];
        
        for(int i=0; i<n;i++){
            char cur = s.charAt(i);
            if(map.containsKey(cur))
                arr[i]= map.get(cur);
            else{
                arr[i]= cur -'a'+ 1;
            }
           }
        int answer = maximumSubarray(arr);
        return answer<0 ? 0 : answer; 
    }
    
    
    public int maximumSubarray(int[] nums){
        int sum=0;
        int max= nums[0];
        for(int i :nums){
            sum+=i;
            max=Math.max(sum,max);
            if(sum<0) sum=0;
            
        }
        return max;
    } 
}
                                    