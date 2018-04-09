package algorithms.longest_palindromic_substring;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    public Solution getSolution() {
        return new Solution();
    }

    @Test
    public void longestPalindrome1() {
        String result = getSolution().longestPalindrome("babad");
        assertEquals("failure - strings are not equal", result, "bab");
    }

    @Test
    public void longestPalindrome2() {
        String result = getSolution().longestPalindrome("bbbbb");
        assertEquals("failure - strings are not equal", result, "bbbbb");
    }

    @Test
    public void longestPalindrome3() {
        String result = getSolution().longestPalindrome("");
        assertEquals("failure - strings are not equal", result, "");
    }

    @Test
    public void longestPalindrome4() {
        String result = getSolution().longestPalindrome("a");
        assertEquals("failure - strings are not equal", result, "a");
    }

    @Test
    public void longestPalindrome5() {
        String result = getSolution().longestPalindrome("abcda");
        assertEquals("failure - strings are not equal", result, "a");
    }

    @Test
    public void longestPalindrome6() {
        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            test.append('a');
        }
        String result = getSolution().longestPalindrome(test.toString());
        assertEquals("failure - strings are not equal", result, test.toString());
    }

    @Test
    public void longestPalindrome7() {
        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 1001; i++) {
            if (i % 2 == 0) {
                test.append('a');
            } else {
                test.append('b');
            }
        }
        String result = getSolution().longestPalindrome(test.toString());
        assertEquals("failure - strings are not equal", result, test.toString());
    }
}

