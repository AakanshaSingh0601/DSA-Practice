class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> set = new HashSet<>();
        for(int i: nums1) set.add(i);
        for(int i: nums2) if(set.contains(i)) return i;
        
        int small1= nums1[0];
        int small2= nums2[0];
        
        int add1 = Integer.parseInt(small1+"" + small2 );
        int add2 = Integer.parseInt(small2+"" + small1 );
        
        return Math.min(add1,add2);
        
        
    }
}