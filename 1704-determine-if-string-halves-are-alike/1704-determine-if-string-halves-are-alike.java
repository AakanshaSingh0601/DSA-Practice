class Solution {
    public boolean halvesAreAlike(String s) {
     Set<Character> Myset= Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count=0;
        int index= s.length()/2;
        
        for(int i =0; i<index;i++){
            char A= s.charAt(i);
            char B= s.charAt(index+i);
             if(Myset.contains((A))) count++;
             if(Myset.contains((B))) count--;
        }
                return count==0;
    }
}




//      "B O | O K"