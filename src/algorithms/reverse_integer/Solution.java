package algorithms.reverse_integer;

public class Solution {
    public int reverse(int x) {
        try {
            return Integer.signum(x) * Integer.valueOf(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
