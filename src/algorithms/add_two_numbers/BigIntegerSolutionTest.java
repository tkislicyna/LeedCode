package algorithms.add_two_numbers;

public class BigIntegerSolutionTest {
    public static void main(String[] args) {
        ListNode first = new ListNode(2);
        first.addNext(4).addNext(3);
        ListNode second = new ListNode(5);
        second.addNext(6).addNext(4);
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(first, second);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
