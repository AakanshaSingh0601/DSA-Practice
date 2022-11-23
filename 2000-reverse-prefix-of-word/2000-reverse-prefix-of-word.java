class Solution {
    public String reversePrefix(String word, char ch) {
       int FirstOccurence = word.indexOf(ch +"");
        if(FirstOccurence==-1) return word;
        char[] arr=word.toCharArray();
        reverse(arr, 0, FirstOccurence);
        String ans = new String(arr);
        return ans;
        
    }
    private void reverse (char arr [] , int start, int end){
        while(start<end){
        char temp = arr[start];
        arr[start++]= arr[end];
        arr[end--]= temp;
        }
    }
}