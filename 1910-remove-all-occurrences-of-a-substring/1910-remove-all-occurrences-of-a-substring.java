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

