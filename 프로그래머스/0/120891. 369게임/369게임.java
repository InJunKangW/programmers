import java.util.*;

class Solution {
    public int solution(int order) {
        String s = String.valueOf(order);
        return (int)s.chars()
            .map(Character::getNumericValue)
            .filter(i -> i != 0 && i % 3 == 0)
            .count();
    }
}