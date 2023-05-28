class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set= new HashSet<>();
        set.add("0,0");
        int i=0;
        int j=0;
        char [] arr = path.toCharArray();
        for(char c: arr){
            if(c=='N') i++;
            if(c=='E') j++;
            if(c=='S') i--;
            if(c=='W') j--;
            
            String position = i+ "," +j;
            if(set.contains(position)) return true;
            set.add(position);
            }
        return false;
    }
}



//     N
//   W   E
//     S
    
    
// N:1
// E:1
// S:1
// W:2
    
//     NNNN