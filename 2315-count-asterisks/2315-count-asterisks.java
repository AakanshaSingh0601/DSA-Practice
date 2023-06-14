class Solution {
    public int countAsterisks(String s) {
        int count =0;
        boolean bar = false;
        char [] str= s.toCharArray();
        
        for(int i=0;i<str.length;i++){
            if(str[i]=='*' && bar==false) count++;
            if(str[i]=='|') bar=!bar;
        }
        return count;
    }
}