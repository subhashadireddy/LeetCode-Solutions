class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        int cols = a[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int r = mid / cols;
            int c = mid % cols;
            int val = a[r][c];
            if(val == target){
               return true;
            }
            else if (val<target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
