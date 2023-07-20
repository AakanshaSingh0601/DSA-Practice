class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        String [] strArr = text.split(" ");
        int ans=0;
        
        for(char c : brokenLetters.toCharArray()){
            set.add(c);
        }
        
        for(String word : strArr){
            boolean isBreak = false;
            for(char c: word.toCharArray()){
                if(set.contains(c)){
                    isBreak=true;
                    break;
                }
            }
            if(isBreak!= true)  
                ans++;
        }
        
       return ans; 
    }
}


// 