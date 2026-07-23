class Solution {
    public int maxProduct(int[] nums) {
        int maxx=nums[0];
        int res=nums[0];
        int minn = nums[0];
        for(int i=1; i<nums.length; i++){
            int candMax = Math.max(nums[i], Math.max(maxx * nums[i], minn * nums[i]));
            int candMin = Math.min(nums[i], Math.min(maxx * nums[i], minn * nums[i]));
            maxx = candMax;
            minn = candMin;
            res = Math.max(res, maxx);
            
        }
        return res;
    }
}