class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] pc = new int[26];
        int [] sc = new int[26];
        List<Integer> result = new java.util.ArrayList<>();
        //count frequency of characters in p..
        for(char c : p.toCharArray())
        {
            pc[c-'a']++;
        }
        //sliding window to count freq in s.
        for(int i=0;i<s.length();i++)
        {
            sc[s.charAt(i) - 'a']++;

            //remove the character that is out of the window..

            if(i>=p.length())
            {
                sc[s.charAt(i - p.length()) - 'a']--;
            }

            //compare the counts
            if(Arrays.equals(pc,sc))
            {
                result.add(i-p.length() + 1);
            }
        } 
        return result;
    }
}
