package algorithms.zig_zag_conversion;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void convert() {
        String result = new Solution().convert("PAYPALISHIRING", 3);
        assertEquals("failure - strings are not equal", result, "PAHNAPLSIIGYIR");
    }

    @Test
    public void convertOneSymbol() {
        String result = new Solution().convert("A", 1);
        assertEquals("failure - strings are not equal", result, "A");
    }

    @Test
    public void convertAB() {
        String result = new Solution().convert("AB", 1);
        assertEquals("failure - strings are not equal", result, "AB");
    }
}
