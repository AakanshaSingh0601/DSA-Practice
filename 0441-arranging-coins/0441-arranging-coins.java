class Solution {
    public int arrangeCoins(int n) {
        int rowNum=1;
        int counter= 0;
        while(n>=0){
            n= n- rowNum;
            rowNum++;
            counter++;
            if(n<0)
            counter--;
        }
      return counter;  
    }
}