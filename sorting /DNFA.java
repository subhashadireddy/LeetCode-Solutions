class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<=j && i<nums.length && j>=0)
        {
            if(nums[i]==0) i++;
            else if(nums[j]==2) j--;
            else if(i>k) k++;
            else if(nums[k] == 0)
            {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
            else if(nums[k]==2)
            {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
            }
            else k++;
        }
    }
}
