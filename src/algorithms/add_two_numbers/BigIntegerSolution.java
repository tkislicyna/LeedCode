package algorithms.add_two_numbers;

import java.math.BigInteger;

public class BigIntegerSolution implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger i1 = BigInteger.ZERO;
        BigInteger i2 = BigInteger.ZERO;
        int exp = 0;
        while (l1 != null || l2 != null) {
            BigInteger base = BigInteger.TEN.pow(exp);
            if (l1 != null) {
                i1 = i1.add(base.multiply(new BigInteger(String.valueOf(l1.val))));
                l1 = l1.next;
            }

            if (l2 != null) {
                i2 = i2.add(base.multiply(new BigInteger(String.valueOf(l2.val))));
                l2 = l2.next;
            }
            exp++;
        }

        BigInteger sum = i1.add(i2);
        ListNode result = null;
        ListNode temp = null;
        while (sum.compareTo(BigInteger.ZERO) > 0) {
            if (result == null) {
                result = new ListNode(sum.mod(BigInteger.TEN).intValue());
                temp = result;
            } else {
                temp.next = new ListNode(sum.mod(BigInteger.TEN).intValue());
                temp = temp.next;
            }
            sum = sum.divide(BigInteger.TEN);
        }
        return result == null ? new ListNode(0) : result;
    }
}
