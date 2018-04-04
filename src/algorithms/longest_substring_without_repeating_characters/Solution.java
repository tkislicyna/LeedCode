package algorithms.longest_substring_without_repeating_characters;

import com.sun.deploy.util.StringUtils;
import org.omg.CORBA.CharSeqHelper;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;
        String uniqueSubstring = "";
        String longestSubstring = "";
        while (!s.isEmpty()) {
            String c = Character.toString(s.charAt(0));
            if (uniqueSubstring.contains(c)) {
                if (longestSubstring.length() < uniqueSubstring.length()) {
                    longestSubstring = uniqueSubstring;
                }
                uniqueSubstring = uniqueSubstring.length() > 1 ? uniqueSubstring.substring(uniqueSubstring.indexOf(c) + 1) : "";
            }
            uniqueSubstring += c;
            s = s.length() > 1 ? s.substring(1) : "";
        }
        if (longestSubstring.length() < uniqueSubstring.length()) {
            longestSubstring = uniqueSubstring;
        }
        return longestSubstring.length();
    }
}