class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
      for(int i =0; i<A.length;i++) {
          int j =0;
          int k= A.length-1;
          while(j<k){
             int temp = A[i][j];
              A[i][j++]= A[i][k];
              A[i][k--]= temp;
          }
          for(j=0;j<A.length;j++){
              A[i][j] =A[i][j] ==1 ?0 :1;
          }
      }
        return A;
    }
}