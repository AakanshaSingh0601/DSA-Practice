class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int first = 0;
        int last = n-1;
        HashSet<Double> set = new HashSet<>();
        while(first<last){
            double avg = (nums[first]+nums[last])/2d;
            set.add(avg);
            first++;
            last--;
        }
        return set.size();
    }
}