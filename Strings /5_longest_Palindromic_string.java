class Solution {

   public int start = 0;
   public int MaxLength = 0 ;

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        for(int i = 0 ; i <= s.length() ; i++){

            expand(s, i , i); // odd
            expand(s,i,i+1); //even

        }
        return s.substring(start , start + MaxLength);
    }

    public void expand(String str , int left , int right){
        while(left >= 0 && right < str.length() &&
        str.charAt(left) == str.charAt(right)){

            left--;
            right++;
        }
        int length = right - left -1;
        if(length > MaxLength){
            MaxLength = length;
            start = left +1;
        }
    }
}
