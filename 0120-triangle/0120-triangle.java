class Solution {
    int rowLimit ;
    List<List<Integer>> arr;
    HashMap<String,Integer>map=new HashMap<>();
    public int minimumTotal(List<List<Integer>> triangle) {
        arr= triangle;
        rowLimit= triangle.size()-1;
        return minDist(0,0);
        
        
    }
    
    private int minDist(int i,int j){
        String pos=i+","+j;
        if(map.containsKey(pos)) return map.get(pos);
        if(i==rowLimit){
            return arr.get(i).get(j);
        }
        int fixed= arr.get(i).get(j);
        int firstWay=fixed+minDist(i+1,j);
        int secondWay=fixed +minDist(i+1,j+1);
        int answer= Math.min(firstWay,secondWay);
        map.put(pos,answer);
        return answer;
    }
}