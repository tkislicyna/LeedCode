package algorithms.zig_zag_conversion;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows == 1 || s.length() <= numRows) {
            return s;
        }
        char[] chars = s.toCharArray();
        int mod = 2 * numRows - 2;

        return IntStream
                .range(0, chars.length)
                .mapToObj(index -> new SimpleImmutableEntry<>(index % mod, chars[index]))
                .map(pair -> {
                    if (pair.getKey() < numRows) {
                        return pair;
                    } else {
                        return new SimpleImmutableEntry<>(mod - pair.getKey(), pair.getValue());
                    }
                })
                .collect(Collectors.groupingBy(Entry::getKey, LinkedHashMap::new, Collectors.mapping(entry -> String.valueOf(entry.getValue()), Collectors.joining())))
                .entrySet()
                .stream()
                .map(Entry::getValue)
                .collect(Collectors.joining());
    }
}
