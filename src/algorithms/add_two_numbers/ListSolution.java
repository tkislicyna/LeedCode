package algorithms.add_two_numbers;

public class ListSolution implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0);
            sum += (l2 != null ? l2.val : 0);
            sum += temp.val;
            temp.val = sum % 10;

            if (sum >= 10) {
                temp.next = new ListNode(1);
                temp = temp.next;
            } else if (l1 != null && l1.next != null || l2 != null && l2.next != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result;
    }
}
