class Solution {
    public boolean judgeCircle(String moves) {
        int uCount=0; int dCount=0; int lCount=0; int rCount=0;
        
        for(char c: moves.toCharArray()){
            if(c =='U') uCount++;
            else if(c =='D') dCount++;
            else if(c =='L') lCount++;
            else rCount++;
        }
       return (uCount==dCount && rCount==lCount) ;
    }
}
// UDLRRR
// UDLL