class Solution {
    public int[] countBits(int n) {
        int[] ans =new int[n+1];
        for(int i = 0; i<=n; i++){
            ans[i] = countOnes(i);
        }
        return ans;
    }
    
    
    private int countOnes(int n){
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for(char c: bin.toCharArray())
            if(c=='1')
                count++;
        return count;
    }
}