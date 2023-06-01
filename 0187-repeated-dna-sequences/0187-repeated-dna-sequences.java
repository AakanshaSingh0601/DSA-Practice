class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map= new HashMap<>();
        int n= s.length();
        for(int i=0;i<=n-10;i++){
            String window= s.substring(i,i+10);
            map.put(window,map.getOrDefault(window,0)+1);
        }
        
        List<String> ans = new ArrayList();
        for(String key: map.keySet()){
            if(map.get(key)>1) ans.add(key);
        }
        return ans;
    }
}



// "AAAAACCCCC AAAAACCCCC CAAAAAGGGTTT"
    
// --AAAAACCCCC
// --AAAAACCCCC

//  1 0 0 1
     