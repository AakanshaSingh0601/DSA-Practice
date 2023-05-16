class Solution {
    public String addStrings(String num1, String num2) {
       int p1 = num1.length()-1;
       int p2 = num2.length()-1;
        char arr1[] = num1.toCharArray();
        char arr2[] = num2.toCharArray();
        int carry=0;
        StringBuilder sb = new StringBuilder();
        
        while(p1>=0 || p2>=0){
            int digit1 = (p1>=0) ? arr1[p1--] - '0': 0;
            int digit2 = (p2>=0) ? arr2[p2--] - '0': 0;
            
            int sum= digit1 + digit2 +carry;
            int toWrite = sum %10;
            carry= sum/10;
            sb.append(toWrite);
            
        }
        if(carry==1) sb.append(carry);
        
      return sb.reverse().toString();
    }
}



    
    