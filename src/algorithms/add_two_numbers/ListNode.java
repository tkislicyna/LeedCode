package algorithms.add_two_numbers;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Definition in leedcode.com  for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
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

    public static ListNode valueOf(String s){
        if (s == null || s.equals(""))
            return null;
        s = s.trim().replaceFirst(",","");
        ListNode node = new ListNode(Character.getNumericValue((s.charAt(0))));
        if(s.length() > 1) {
            node.next = valueOf(s.substring(1));
        }
        return node;
    }

    public String toString() {
        return val + (next != null ? ","+next.toString() : "");
    }
}
