package algorithms.add_two_numbers;

//  Definition for singly-linked list
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode addNext(int x) {
        next = new ListNode(x);
        return next;
    }
}
