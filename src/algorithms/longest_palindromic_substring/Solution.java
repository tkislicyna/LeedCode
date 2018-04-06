package algorithms.longest_palindromic_substring;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1)
            return s;

        char[] chars = s.toCharArray();
        int maxlength = 0;
        String substringPalindrom = "";
        for (int i = 0; i < chars.length; i++) {
            if (maxlength > chars.length - i)
                break;

            String c = Character.toString(chars[i]);
            if (maxlength < 1) {
                maxlength = 1;
                substringPalindrom = c;
            }
            if (s.length() > i + 1) {
                int inext = i;
                while (inext >= 0) {
                    inext = s.indexOf(c, inext + 1);
                    if (inext >= 0) {
                        String substring = s.substring(i, inext + 1);
                        if (substring.equals(new StringBuffer(substring).reverse().toString())) {
                            if (maxlength < substring.length()) {
                                maxlength = substring.length();
                                substringPalindrom = substring;
                            }
                        }
                    }
                }
            }
        }
        return substringPalindrom;
    }
}
