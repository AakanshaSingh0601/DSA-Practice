class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:candyType){
            set.add(i);
        }
        
        return Math.min(candyType.length/2,set.size());    
    }
}


// 1 1 2 2 3 3
 //i