class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        int i =0;
        for(char c: s.toCharArray()){
            if(!map.containsKey(c)) map.put(c, new ArrayList<Integer>());
            map.get(c).add(i);
            i++;
        }
        i = 0;
        for(char c: s.toCharArray()){
            if(map.get(c).size()==1) return i;
            i++;
        }
        return -1;
    }
}