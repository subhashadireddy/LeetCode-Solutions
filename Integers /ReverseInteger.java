class Solution {
    public int reverse(int x) {
        int res = 0 ;
        boolean neg = x < 0;
        String strx = String.valueOf(Math.abs(x));
        StringBuilder ab = new StringBuilder(strx).reverse();
        try {
            res = Integer.parseInt(ab.toString());
        }
        catch(NumberFormatException e ){
            return 0;
        }
        return neg? res*(-1):res;
    }
}
