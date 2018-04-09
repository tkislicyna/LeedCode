package algorithms.longest_substring_without_repeating_characters;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    public Solution getSolution() {
        return new Solution();
    }

    @Test
    public void lengthOfLongestSubstring1() {
        int result = getSolution().lengthOfLongestSubstring("abcabcbb");
        assertEquals("failure - ints are not equal", result, 3);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        int result = getSolution().lengthOfLongestSubstring("bbbbbb");
        assertEquals("failure - ints are not equal", result, 1);
    }

    @Test
    public void emptyString() {
        int result = getSolution().lengthOfLongestSubstring("");
        assertEquals("failure - ints are not equal", result, 0);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        int result = getSolution().lengthOfLongestSubstring("abcd");
        assertEquals("failure - ints are not equal", result, 4);
    }
}
