class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int left =0;
        int maxlength =0;
        for(int r =0;r<nums.length;r++){
            map.put(nums[r] , map.getOrDefault(nums[r],0)+1);

            while(map.get(nums[r]) > k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            maxlength = Math.max(maxlength , r-left+1);
        }
        return maxlength;
    }
}
