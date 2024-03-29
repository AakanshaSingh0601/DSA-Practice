class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<> ();
        char [] arr = s.toCharArray();
        for(char c : arr){
            if(c=='(' || c=='[' || c=='{')
                stack.add(c);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(top=='(' )if(c!=')') return false; 
                if(top=='[') if(c!=']') return false;
                if(top=='{') if(c!='}') return false;
            }
        }
        return stack.isEmpty();
        
    }
}

