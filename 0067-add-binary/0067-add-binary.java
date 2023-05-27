class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();
        int carry =0;
        int ptr1 = arr1.length -1;
        int ptr2 = arr2.length -1;
        
        while(ptr1>=0 || ptr2>=0){
            int num1 = ptr1<0 ? 0:arr1[ptr1] == '0' ? 0:1;
            int num2 = ptr2<0 ? 0:arr2[ptr2] == '0' ? 0:1;
            int sum = num1 + num2 +carry;
            carry = sum>1 ? 1:0;
            sb.append(sum%2);
            ptr1--;
            ptr2--;
            }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}

// 1 1
//   1
//   1 == 3  11
    
//     1 1 1 1
//            1