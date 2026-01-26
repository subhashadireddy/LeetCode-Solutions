class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {

            if (seen.contains(n)) {
                return false; // loop detected
            }

            seen.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return true; // reached 1
    }
}
