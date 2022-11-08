class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder reverse = new StringBuilder();
        int j = s.length()-1;
        for(int i =0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                while(!Character.isLetter(s.charAt(j))){
                    j--;
                }
                reverse.append(s.charAt(j));
                j--;
        }
        else{
            reverse.append(s.charAt(i));
        }
        }
        return reverse.toString();
    }
}