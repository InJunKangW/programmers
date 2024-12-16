import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] sArray = my_string.split("\\D");
        return Arrays.stream(sArray)
            .filter(s -> !s.isBlank())
            .mapToInt(Integer::parseInt)
            .sum();
    }
}