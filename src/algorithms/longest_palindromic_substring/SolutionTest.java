package algorithms.longest_palindromic_substring;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void longestPalindrome1() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("babad");
        assertEquals("failure - strings are not equal", result, "bab");
    }

    @Test
    public void longestPalindrome2() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("bbbbb");
        assertEquals("failure - strings are not equal", result, "bbbbb");
    }

    @Test
    public void longestPalindrome3() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("");
        assertEquals("failure - strings are not equal", result, "");
    }

    @Test
    public void longestPalindrome4() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("a");
        assertEquals("failure - strings are not equal", result, "a");
    }

    @Test
    public void longestPalindrome5() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("abcda");
        assertEquals("failure - strings are not equal", result, "a");
    }

    @Test
    public void longestPalindrome6() {
        Solution solution = new Solution();

        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            test.append('a');
        }
        String result = solution.longestPalindrome(test.toString());
        assertEquals("failure - strings are not equal", result, test.toString());
    }

    @Test
    public void longestPalindrome7() {
        Solution solution = new Solution();

        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 1001; i++) {
            if (i % 2 == 0)
                test.append('a');
            else
                test.append('b');
        }
        String result = solution.longestPalindrome(test.toString());
        assertEquals("failure - strings are not equal", result, test.toString());
    }
}

