class Solution {
    public int rob(int[] nums) {
        int prev=0;
        int prev1=nums[0];
        int curi=0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        prev = Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++)
        {
            curi = Math.max(prev1+nums[i],prev);
            prev1 = prev;
            prev = curi;   
        }
        return prev;
    }
}
