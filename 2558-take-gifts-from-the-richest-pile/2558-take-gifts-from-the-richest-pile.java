class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        for(int i: gifts){
            pq.add(i);
        }
        
        for(int i=0;i<k;i++){
         int highest= pq.remove();
         int sqr= (int)Math.sqrt(highest);
            pq.add(sqr);
        }
        
        for(int i: pq){
            ans+=i;
        }
        return ans;
    }
}
//5,8,9,4,3     
//k=0
  
