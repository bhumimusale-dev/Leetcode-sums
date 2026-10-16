class Solution {
    public int maxSubArray(int[] nums) {
        int Current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            Current = Math.max(nums[i], Current + nums[i]);
            max = Math.max (max, Current);
        }
        return max;
    }
}