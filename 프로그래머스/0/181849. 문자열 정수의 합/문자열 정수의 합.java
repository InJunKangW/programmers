import java.util.stream.*;

class Solution {
    public int solution(String num_str) {
        return num_str.chars()
            .map(c -> Character.getNumericValue(c))
            .sum();
    }
}