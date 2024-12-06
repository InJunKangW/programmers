import java.util.stream.*;

class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        return s.chars()
            .map(Character::getNumericValue)
            .sum();
    }
}