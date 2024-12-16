import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Map<Character, Long> frequencyMap = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
