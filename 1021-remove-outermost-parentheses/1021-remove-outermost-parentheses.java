class Solution {
     public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && count++ > 0) sb.append(c);
            if (c == ')' && count-- > 1) sb.append(c);
        }
        return sb.toString();
    }
}

// ( ()() ) ( () )

// c+1
//   +2
//   +1
//     +2
//     +1
//     0
    
    
// ( ( ) ( ) ) ( ( ) )
// 1 2 1 2 1 0 1 2 1 0