package algorithms.longest_substring_without_repeating_characters;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring1(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals("failure - ints are not equal", result,3);
    }

    @Test
    public void lengthOfLongestSubstring2(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("bbbbbb");
        assertEquals("failure - ints are not equal", result,1);
    }

    @Test
    public void emptyString(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("");
        assertEquals("failure - ints are not equal", result,0);
    }

    @Test
    public void lengthOfLongestSubstring4(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcd");
        assertEquals("failure - ints are not equal", result,4);
    }
}
