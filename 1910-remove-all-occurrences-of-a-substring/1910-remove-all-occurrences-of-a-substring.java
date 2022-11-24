class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.indexOf(part)!=-1){
            int index= s.indexOf(part);
            String str= s.substring(0,index) + s.substring(index+part.length());
                s= str;
        }
       
       return s ;
    }
}

// a a b b c a a
// 0 1 2 3 4 5 6  
    
    
//     i + part.length() = 3+2 = 5