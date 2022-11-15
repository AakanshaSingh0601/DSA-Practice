class Solution {
    public int singleNumber(int[] nums) {
       Map< Integer, Integer> myMap= new HashMap<> ();
        for(int i : nums){
            myMap.put(i , myMap.getOrDefault(i, 0)+1);
        }
        for(int key : myMap.keySet()){
            if(myMap.get(key) ==1)
                return key;
        }
        return -1;
    }
}