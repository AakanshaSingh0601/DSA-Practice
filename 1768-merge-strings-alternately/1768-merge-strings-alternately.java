class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0, j=0;
       StringBuilder answer= new StringBuilder();
        int first= word1.length();
        int second = word2.length();
        
        
        while(i<first || j<second){
         if(i<first) answer.append(word1.charAt(i++)); 
            if(j<second) answer.append(word2.charAt(j++));  
        }
        return new String(answer);
    }  
}