class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j = s.length - 1;
        while(i<=j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
      
    }
}
// we use two pointers instread of using reverse(), by creating extra space to reduce space and time complexity
