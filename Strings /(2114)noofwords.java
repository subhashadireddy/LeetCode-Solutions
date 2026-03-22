class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String s : sentences) {
            int words = 1; 
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    words++;
                }
            }
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}
