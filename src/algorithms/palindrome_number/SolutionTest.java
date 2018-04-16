package algorithms.palindrome_number;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    public Solution getSolution() {
        return new Solution();
    }

    @Test
    public void isPalindromeTest() {
        boolean result = getSolution().isPalindrome(121);
        assertEquals("failure - boolean are not equal", result, true);
    }

    @Test
    public void isPalindromeNegativeTest() {
        boolean result = getSolution().isPalindrome(-121);
        assertEquals("failure - boolean are not equal", result, false);
    }

    @Test
    public void isPalindromeZeroTest() {
        boolean result = getSolution().isPalindrome(0);
        assertEquals("failure - boolean are not equal", result, true);
    }

    @Test
    public void isPalindromeNumberTest() {
        boolean result = getSolution().isPalindrome(5);
        assertEquals("failure - boolean are not equal", result, true);
    }
}
