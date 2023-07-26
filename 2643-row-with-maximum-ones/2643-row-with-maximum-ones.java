class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int idx = 0;
        int maxidx = 0;
        int ans[] = new int[2];
        
        for( int arr[]: mat ){
            int oneCount=0;
            for(int cur : arr){
                if(cur==1)
                oneCount++; 
            }
            if(oneCount> max){
                max = oneCount;
                maxidx = idx;
            }
            idx++;
        }
        ans[0] = maxidx;
        ans[1] = max;
       return ans; 
    }
}



