package algorithms.zig_zag_conversion;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    public Solution getSolution() {
        return new Solution();
    }

    @Test
    public void convert() {
        String result = getSolution().convert("PAYPALISHIRING", 3);
        assertEquals("failure - strings are not equal", result, "PAHNAPLSIIGYIR");
    }

    @Test
    public void convertOneSymbol() {
        String result = getSolution().convert("A", 1);
        assertEquals("failure - strings are not equal", result, "A");
    }

    @Test
    public void convertAB() {
        String result = getSolution().convert("AB", 1);
        assertEquals("failure - strings are not equal", result, "AB");
    }
}
