class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int n:nums1)
        {
            set1.add(n);
        }
        for(int n:nums2)
        {
            if(set1.contains(n))
            {
                result.add(n);
            }
        }
        int []a = new int[result.size()];
        int i=0;
        for(int n:result)
        {
            a[i++] = n;
        }
        return a;
    }
}
