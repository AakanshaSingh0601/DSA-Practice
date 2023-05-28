class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            if(grid[i][i]==0) return false;
        }
        int row=0;
        int col=n-1;
        while(row<n || col>=0){
            if(grid[row][col]==0) return false; 
            row++;
            col--;
        }
        int count=0;
       for(int arr[] : grid){
           for(int i:arr){
               if(i==0)count++;
           }
       } 
        if(n%2==0){
            if(count!=n*n-n-n) return false;
        }   
        else{
            if(count!=n*n-n-n+1) return false;
        }
        return true;
    }
}



   




// nxn -n -n





