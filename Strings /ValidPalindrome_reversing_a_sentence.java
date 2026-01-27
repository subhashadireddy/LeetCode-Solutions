class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= 'a' && a[i] <= 'z') ||
                (a[i] >= 'A' && a[i] <= 'Z') ||
                (a[i] >= '0' && a[i] <= '9')) {

                str.append(Character.toLowerCase(a[i]));
            }
        }

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        return str.toString().equals(str1.toString());
    }
}


// in Java we should not use (==) operator for comparision of two strings..... because it only checks the references ... even if the values are same it returns false//
