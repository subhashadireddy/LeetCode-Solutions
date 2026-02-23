import java.util.Scanner;

public class peakelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
             nums[i] = sc.nextInt();
            
        }

        Solution sol = new Solution();
        int peakIndex = sol.findPeakElement(nums);
        System.out.println(peakIndex);
    }

}


class Solution {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;   
            } else {
                right = mid;     
            }
        }
        return left; 
    }
}
