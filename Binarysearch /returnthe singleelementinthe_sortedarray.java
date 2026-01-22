public class singleelementinaSortedarray {
    public static void main(String[] args)
    {
        int a[] = {1,2,2,3,3,4,4,8,8};
        System.out.println("Single element: " + singleNonDuplicate(a));
    }
    public static int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            boolean isEven = (mid % 2 == 0);
            
            if (nums[mid] == nums[mid + 1]) {
                if (isEven) {
                    l = mid + 2;
                } else {
                    r = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if (isEven) {
                    r = mid - 2;
                } else {
                    l = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[l];
    }
}
