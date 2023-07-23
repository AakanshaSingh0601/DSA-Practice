class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        for(int i : stones){
            pq.add(i);
            
        }
        while(!pq.isEmpty()){
            if(pq.size()==1){
                return pq.remove();
            }
            int stoneA = pq.remove();
            int stoneB = pq.remove();
            
            if(stoneA != stoneB){
                pq.add(stoneA-stoneB);
            }
        }
        return 0;
    }
}

