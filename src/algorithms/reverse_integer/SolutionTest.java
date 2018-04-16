package algorithms.reverse_integer;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    public Solution getSolution(){
        return new Solution();
    }

    @Test
    public void reverseTest(){
        int result = getSolution().reverse(123);
        assertEquals("failure - ints are not equal", result, 321);
    }

    @Test
    public void reverseNegativeTest(){
        int result = getSolution().reverse(-123);
        assertEquals("failure - ints are not equal", result, -321);
    }

    @Test
    public void reverseZeroTest(){
        int result = getSolution().reverse(0);
        assertEquals("failure - ints are not equal", result, 0);
    }

    @Test
    public void reverseNegativeZeroTest(){
        int result = getSolution().reverse(-0);
        assertEquals("failure - ints are not equal", result, -0);
    }

    @Test
    public void reverseBigNumberTest(){
        int result = getSolution().reverse(1534236469);
        assertEquals("failure - ints are not equal", result, 0);
    }


    @Test
    public void reverseMaxValueTest(){
        int result = getSolution().reverse(Integer.MAX_VALUE);
        assertEquals("failure - ints are not equal", result, 0);
    }


}

