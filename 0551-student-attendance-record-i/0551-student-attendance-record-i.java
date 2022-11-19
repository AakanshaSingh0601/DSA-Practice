class Solution {
    public boolean checkRecord(String s) {
        int A =0;
        for(int i =0; i<s.length() ;i++){
            char c = s.charAt(i);
            if(c == 'A'){
                A++;
            }
              if(A==2){
                  return false;
              }  
            if(i>0 && i<s.length()-1 && c=='L'){
                char prev= s.charAt(i-1);
                char next =s.charAt(i+1);
                if(prev=='L' && next=='L')
                    return false;
                }
        }
       return true; 
    }
}