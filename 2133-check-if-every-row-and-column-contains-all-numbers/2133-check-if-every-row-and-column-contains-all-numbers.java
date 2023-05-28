class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int arr[]: matrix){
            HashSet<Integer> set = new HashSet<>();
            for(int i:arr){
                set.add(i);
            }
            if(set.size() != n) return false;
        }
        for(int i =0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j =0;j<n;j++){
                int curr = matrix[j][i];
                set.add(curr);
            }
            if(set.size()!=n) return false;
        }
        return true;
    }
}