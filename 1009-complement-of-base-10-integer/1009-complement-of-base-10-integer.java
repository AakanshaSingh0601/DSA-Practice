class Solution {
    public int bitwiseComplement(int n) {
      String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        
        for(char c: str.toCharArray()){
            if(c=='1') sb.append(0);
            if(c=='0') sb.append(1);
        }
        
        int result= Integer.parseInt(sb.toString(),2);
        
        return result;
    }
}