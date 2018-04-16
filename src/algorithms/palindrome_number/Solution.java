package algorithms.palindrome_number;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int length = (int) Math.log10(x) + 1;
        int mid = length / 2;

        List<Integer> numbers = new ArrayList(length);
        while (x > 0) {
            numbers.add(x % 10);
            x = x / 10;
        }

        for (int i = 0; i < mid; i++) {
            if (!numbers.get(i).equals(numbers.get(length - i - 1))) {
                return false;
            }
        }

        return true;
    }
}