class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int size = arr.length;
        int copyArr [] = new int [size];
        for(int i=0;i<size;i++){
            copyArr[i] = arr[i];
        }
        
        Arrays.sort(copyArr);
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int rank =1;
        for(int i : copyArr){
           if(!map.containsKey(i)){
               map.put(i,rank);
               rank++;
           }
        }
        int[] ans = new int[size];
        
        for(int i=0;i<size;i++){
            ans[i]= map.get(arr[i]);
        }
        return ans;
    }
}