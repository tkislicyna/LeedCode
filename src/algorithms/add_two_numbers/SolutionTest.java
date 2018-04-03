package algorithms.add_two_numbers;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    private  Solution solution = new ListSolution();

    @Test
    public void addTwoNumbers() {
        ListNode first = ListNode.valueOf("243");
        ListNode second = ListNode.valueOf("564");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "7,0,8");
    }

    @Test
    public void addZeroAndNumber() {
        ListNode first = ListNode.valueOf("0");
        ListNode second = ListNode.valueOf("564");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "5,6,4");
    }

    @Test
    public void addNumberAndZero() {
        ListNode first = ListNode.valueOf("243");
        ListNode second = ListNode.valueOf("0");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "2,4,3");
    }

    @Test
    public void addLongNumbers() {
        ListNode first = ListNode.valueOf("9");
        ListNode second = ListNode.valueOf("1999999999");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "0,0,0,0,0,0,0,0,0,0,1");
    }

    @Test
    public void add1plus99() {
        ListNode first = ListNode.valueOf("1");
        ListNode second = ListNode.valueOf("99");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "0,0,1");
    }

    @Test
    public void addTwoZeros() {
        ListNode first = ListNode.valueOf("0");
        ListNode second = ListNode.valueOf("0");

        ListNode result = solution.addTwoNumbers(first, second);
        assertEquals("failure - strings are not equal", result.toString(), "0");
    }
}
