class Solution {
    public int minimumAverageDifference(int[] nums) {

        int n = nums.length;

        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;

        int answer = 0;

        for (int i = 0; i < n; i++) {

            leftSum += nums[i];

            long rightSum = totalSum - leftSum;

            long leftAvg = leftSum / (i + 1);

            long rightAvg;

            if (i == n - 1)
                rightAvg = 0;
            else
                rightAvg = rightSum / (n - i - 1);

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                answer = i;
            }
        }

        return answer;
    }
}
