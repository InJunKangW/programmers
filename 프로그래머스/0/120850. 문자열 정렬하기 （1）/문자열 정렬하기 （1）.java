import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
            .filter(Character::isDigit)
            .map(c -> Character.getNumericValue(c))
            .sorted()
            .toArray();
    }
}