import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthGroup = new HashMap<>();
        for (String str : strArr) {
            int length = str.length();
            lengthGroup.put(length, lengthGroup.getOrDefault(length, 0) + 1);
        }

        return lengthGroup.entrySet()
                          .stream()
                          .max(Comparator.comparingInt(Map.Entry::getValue))
                          .map(Map.Entry::getValue)
                          .orElse(0);
    }
}