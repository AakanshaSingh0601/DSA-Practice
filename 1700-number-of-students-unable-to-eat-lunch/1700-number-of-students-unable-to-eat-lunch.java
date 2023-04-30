class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue= new ArrayDeque<>();
        for(int i=sandwiches.length-1;i>=0;i--){
           stack.add(sandwiches[i]);
            }
        for(int i: students){
            queue.add(i);
        }
        int count=0;
        int n= students.length;
        while(!queue.isEmpty()){
            if(stack.peek()== queue.peek()){
                stack.pop();
                queue.remove();
                count=0;
            }
            else{
                int first= queue.remove();
                queue.add(first);
                count++;
                if(count==n){
                    return queue.size();
                }            
            }
        }
        return 0;
        }
}

/* if(stack.top == queue.peek)
    stack.remove; 
    queue.remove;

else{
    int first= queue.remove;
    queue.add(first);
}
*/