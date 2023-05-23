class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        HashSet<Integer> set = new HashSet<>();
 
        for(int i = 0; i<n ; i++){
            set.add(nums[i]);
            HashSet<Integer> set2 = new HashSet<>();
            for(int j = i+1; j<n; j++) set2.add(nums[j]);
            int pre = set.size();
            int suf = set2.size();
            ans[i] = pre - suf;
        }
        return ans;
    }
}