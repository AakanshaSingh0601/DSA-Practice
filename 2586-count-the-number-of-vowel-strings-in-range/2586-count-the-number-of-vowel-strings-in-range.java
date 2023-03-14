class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        int count = 0;
        Set<Character> mySet = new HashSet<>();
        mySet.add('a');
        mySet.add('e');
        mySet.add('i');
        mySet.add('o');
        mySet.add('u');
        
        for(int i=left; i<=right; i++){
            String vowel = words[i];
            if(mySet.contains(vowel.charAt(0)) &&                                  mySet.contains(vowel.charAt(vowel.length()-1)))
                count++;
        }
        
        return count;
    }
}