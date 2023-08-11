class Solution {
    public int findKthPositive(int[] arr, int k) {
       HashSet<Integer>set = new HashSet<>();
       ArrayList<Integer>list = new ArrayList<>();
        
        for(int i: arr){
            set.add(i);
        }
        
        for(int i=1;i<2002;i++){
            if(!set.contains(i)){
                list.add(i);
            }
            
        }
        // System.out.print(list);
        return list.get(k-1);
    }
}


    