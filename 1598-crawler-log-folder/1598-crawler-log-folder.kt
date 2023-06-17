class Solution {
    fun minOperations(logs: Array<String>): Int {
        var st : Stack<String> = Stack()
        
        for(op in logs){
            if(op=="../"){
                if(st.isEmpty()) continue
                st.pop()
            }
            else if(op=="./")
                continue
            else{
                st.add(op)
            }
        }
        return st.size
    }
}