class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        boolean changed = false;
        String str = ""+num;
        for(char c: str.toCharArray()){
            if(!changed && c=='6'){
                sb.append('9');
                changed = true;
            }
            else{
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}