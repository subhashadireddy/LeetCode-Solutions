class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> st = new HashSet<>();

        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
            st.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = min+1 ; i < max ; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
