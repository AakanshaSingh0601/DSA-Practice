class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        
        char curr='a';
        map.put(' ', ' ');
        for(char c: key.toCharArray()){
            if(map.containsKey(c)){
                continue;
            }
            map.put(c,curr);
            curr++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char c: message.toCharArray()){
            sb.append(map.get(c));
        }
        
        return sb.toString();
        
    }
}