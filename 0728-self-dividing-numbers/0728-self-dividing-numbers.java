class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans= new ArrayList();
        
        for(int i=left;i<=right;i++){
            if(selfDivingno(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    
    
    
    public boolean selfDivingno(int n){
        String str= n + "";
        
        for(char c: str.toCharArray()){
            int digit = c-'0';
            if(digit==0) return false;
            if( n%digit!=0){
                return false;
            }
        }
        return true;
    }
}